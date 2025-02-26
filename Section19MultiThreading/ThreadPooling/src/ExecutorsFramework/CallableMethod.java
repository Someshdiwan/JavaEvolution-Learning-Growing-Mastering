package ExecutorsFramework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class CallableMethod {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<Integer> callable1 = () -> {
            System.out.println("Task 1");
            return 1;
        };
        Callable<Integer> callable2 = () -> {
            System.out.println("Task 2");
            return 2;
        };
        Callable<Integer> callable3 = () -> {
            System.out.println("Task 3");
            return 3;
        };

        // Corrected generic type
        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);

        // Store the futures
        List<Future<Integer>> futures = executorService.invokeAll(list,1000, TimeUnit.MILLISECONDS);

        // Retrieve and print results
        for (Future<Integer> f : futures) {
            System.out.println(f.get());
        }

        executorService.shutdown();
        System.out.println("Hello World");
    }
}
//InvokeALL() method done.