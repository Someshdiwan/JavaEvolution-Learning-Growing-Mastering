import java.util.Random;
import java.util.concurrent.*;

public class MatrixMultiplyWithBarrier {

    public static void main(String[] args) throws InterruptedException {
        final int N = 600; // rows of A and C
        final int M = 500; // cols of A, rows of B
        final int P = 400; // cols of B and C
        final int numWorkers = 8;

        double[][] A = randomMatrix(N, M);
        double[][] B = randomMatrix(M, P);
        double[][] C = new double[N][P];
        double[] rowNorms = new double[N]; // store norms separately

        // Barrier after multiplication phase
        CyclicBarrier barrierPhase1 = new CyclicBarrier(numWorkers, () ->
                System.out.println("Phase 1 complete: All workers finished their assigned rows.")
        );

        // Barrier after norm phase (distinct action)
        CyclicBarrier barrierPhase2 = new CyclicBarrier(numWorkers, () ->
                System.out.println("Phase 2 complete: All workers finished computing norms.")
        );

        ExecutorService executor = Executors.newFixedThreadPool(numWorkers);
        int rowsPerWorker = (N + numWorkers - 1) / numWorkers;

        long startParallel = System.currentTimeMillis();

        for (int w = 0; w < numWorkers; w++) {
            int startRow = w * rowsPerWorker;
            int endRow = Math.min(N, startRow + rowsPerWorker);
            if (startRow >= endRow) break;
            executor.submit(new Worker(A, B, C, rowNorms, startRow, endRow, barrierPhase1, barrierPhase2));
        }

        executor.shutdown();
        if (!executor.awaitTermination(5, TimeUnit.MINUTES)) {
            executor.shutdownNow();
            throw new RuntimeException("Workers didn't finish in time.");
        }
        long endParallel = System.currentTimeMillis();
        System.out.println("Parallel time (ms): " + (endParallel - startParallel));

        System.out.println("Verifying result with sequential multiply...");
        long startSeq = System.currentTimeMillis();
        double[][] Cseq = sequentialMultiply(A, B);
        long endSeq = System.currentTimeMillis();
        System.out.println("Sequential time (ms): " + (endSeq - startSeq));

        if (matricesEqual(C, Cseq, 1e-6)) {
            System.out.println("Verification passed: parallel result matches sequential result.");
        } else {
            System.err.println("Verification failed: results do not match!");
        }

        // Optional: inspect some norms
        System.out.println("First 5 row norms: ");
        for (int i = 0; i < Math.min(5, rowNorms.length); i++) {
            System.out.printf("row %d norm = %.6f%n", i, rowNorms[i]);
        }
    }

    static class Worker implements Runnable {
        private final double[][] A, B, C;
        private final double[] rowNorms;
        private final int startRow, endRow;
        private final CyclicBarrier barrier1, barrier2;

        Worker(double[][] A, double[][] B, double[][] C, double[] rowNorms,
               int startRow, int endRow,
               CyclicBarrier barrier1, CyclicBarrier barrier2) {
            this.A = A; this.B = B; this.C = C; this.rowNorms = rowNorms;
            this.startRow = startRow; this.endRow = endRow;
            this.barrier1 = barrier1; this.barrier2 = barrier2;
        }

        @Override
        public void run() {
            try {
                // Phase 1: multiply assigned rows
                for (int i = startRow; i < endRow; i++) {
                    double[] aRow = A[i];
                    double[] cRow = C[i];
                    for (int k = 0; k < aRow.length; k++) {
                        double aVal = aRow[k];
                        double[] bRow = B[k];
                        for (int j = 0; j < bRow.length; j++) {
                            cRow[j] += aVal * bRow[j];
                        }
                    }
                }

                // sync after multiplication
                barrier1.await();

                // Phase 2: compute norms and store in separate array (do not overwrite C)
                for (int i = startRow; i < endRow; i++) {
                    double sumSq = 0.0;
                    for (double v : C[i]) sumSq += v * v;
                    rowNorms[i] = Math.sqrt(sumSq);
                }

                // sync after norms
                barrier2.await();

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Worker interrupted for rows " + startRow + "-" + endRow);
            } catch (BrokenBarrierException e) {
                System.err.println("Barrier broken for rows " + startRow + "-" + endRow + ": " + e.getMessage());
            }
        }
    }

    // utilities (same as before)
    static double[][] randomMatrix(int rows, int cols) {
        Random rnd = new Random(42);
        double[][] m = new double[rows][cols];
        for (int i = 0; i < rows; i++) for (int j = 0; j < cols; j++) m[i][j] = rnd.nextDouble();
        return m;
    }

    static double[][] sequentialMultiply(double[][] A, double[][] B) {
        int n = A.length, m = A[0].length, p = B[0].length;
        double[][] C = new double[n][p];
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                double a = A[i][k];
                for (int j = 0; j < p; j++) {
                    C[i][j] += a * B[k][j];
                }
            }
        }
        return C;
    }

    static boolean matricesEqual(double[][] X, double[][] Y, double eps) {
        if (X.length != Y.length) return false;
        for (int i = 0; i < X.length; i++) {
            if (X[i].length != Y[i].length) return false;
            for (int j = 0; j < X[i].length; j++) {
                if (Math.abs(X[i][j] - Y[i][j]) > eps) {
                    System.err.printf("Mismatch at [%d,%d]: %f vs %f%n", i, j, X[i][j], Y[i][j]);
                    return false;
                }
            }
        }
        return true;
    }
}
