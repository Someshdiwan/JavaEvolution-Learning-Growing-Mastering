import java.util.concurrent.*;

/**
 * ExecutorService version of the CyclicBarrier subsystem startup example.
 */
public class MainWithExecutorService {
    public static void main(String[] args) {
        int numberOfSubsystems = 4;

        // Barrier action: runs once when all subsystems reach the barrier
        CyclicBarrier barrier = new CyclicBarrier(numberOfSubsystems, () ->
                System.out.println("All subsystems are up and running. System startup complete.")
        );

        // Use a fixed thread pool to manage threads
        ExecutorService executor = Executors.newFixedThreadPool(numberOfSubsystems);

        // Submit subsystem tasks to the executor
        executor.submit(new Subsystem("Web Server", 2000, barrier));
        executor.submit(new Subsystem("Database", 4000, barrier));
        executor.submit(new Subsystem("Cache", 3000, barrier));
        executor.submit(new Subsystem("Messaging Service", 3500, barrier));

        // orderly shutdown and wait for completion
        executor.shutdown();
        try {
            if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
                System.out.println("Forcing shutdown...");
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }

        System.out.println("Main finished.");
    }
}

class Subsystem implements Runnable {
    private final String name;
    private final int initializationTimeMillis;
    private final CyclicBarrier barrier;

    public Subsystem(String name, int initializationTimeMillis, CyclicBarrier barrier) {
        this.name = name;
        this.initializationTimeMillis = initializationTimeMillis;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " starting initialization...");
            Thread.sleep(initializationTimeMillis); // simulate initialization work
            System.out.println(name + " initialization complete. Waiting at barrier...");
            barrier.await(); // wait for other subsystems
            System.out.println(name + " proceeding after barrier.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println(name + " was interrupted.");
        } catch (BrokenBarrierException e) {
            System.err.println(name + " barrier broken: " + e.getMessage());
        }
    }
}
