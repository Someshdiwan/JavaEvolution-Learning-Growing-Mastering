import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Author: Somesh Diwan
 * Date: 16-Sep-2025
 * Time: 19:49
 * © Somesh Diwan. All rights reserved.
 */

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i < 10; i++) {
            int finalI = i;

            Future<?> future = executor.submit( () -> {
                long result = factorial(finalI);
                System.out.println(result);
            });
        }
        executor.shutdown();

        try {
            executor.awaitTermination(100, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
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
