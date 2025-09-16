import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        // supplyAsync() → background thread me asynchronous task run hoga.
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() ->
       {
            try {
                Thread.sleep(5000);
                System.out.println("Worker");
            } catch (Exception e) {

            }
            return "Ok";
        });
       String s = null;
       try {
           s = completableFuture.get();
       } catch (InterruptedException | ExecutionException e) {
           throw new RuntimeException(e);
       }
       System.out.println(s);
       System.out.println("Main");
    }
}

// Asynchronous task ko run kar sakte ho CompletableFuture ke through
