package ExecutorsFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        //Methods: Executors.newFixedThreadPool(9); & Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(9);

        //Thread[] threads = new Thread[9]; //Creating 9 threads here in Array.
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            executorService.submit(() ->
            {
                long result = factorial(finalI);
                System.out.println(result);
            });
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Total TIme: " + (System.currentTimeMillis() - startTime));
    }

            /*threads[i-1]= new Thread(() -> {
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
        }*/

            //System.out.println("Total time: " + (System.currentTimeMillis() - startTime));

            private static long factorial(int n)
            {
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