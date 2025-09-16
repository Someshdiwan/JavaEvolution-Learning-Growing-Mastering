import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Callable<String> callable = () -> "Hello";
        // Runnable runnable = () -> "Hello";

        Future<?> future = executorService.submit(() -> System.out.println("Hello"));
        if(future.isDone()) {
            System.out.println("Task is done");
        }
        System.out.println(future.get());
        executorService.shutdown();
    }
}
