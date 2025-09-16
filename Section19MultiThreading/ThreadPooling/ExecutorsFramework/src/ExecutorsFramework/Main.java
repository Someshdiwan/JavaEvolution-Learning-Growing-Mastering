package ExecutorsFramework;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Thread[] threads = new Thread[9];
        //Creating 9 threads here in Array. for finding a factorial of 9 numbers. we also can write 3 instead of 9.
        //3 threads finding factorial.

        for (int i = 1; i < 10; i++) {
            int finalI = i;

            threads[i-1]= new Thread(() -> {
                long result = factorial(finalI);
                System.out.println(result);
            }
            );

            threads[i-1].start();
            //thread.start();
        }
        for(Thread thread : threads){
            try{
                thread.join();
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Total time: " + (System.currentTimeMillis() - startTime));
    }
    private static long factorial(int n) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
