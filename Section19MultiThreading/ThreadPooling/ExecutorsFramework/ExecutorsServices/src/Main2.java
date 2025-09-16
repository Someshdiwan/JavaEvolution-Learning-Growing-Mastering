import javax.swing.plaf.FontUIResource;
import java.util.concurrent.*;

public class Main2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Future<String> future1 = executorService.submit(new DependantServices());
        Future<String> future2 = executorService.submit(new DependantServices());
        Future<String> future3 = executorService.submit(new DependantServices());

        future1.get();
        future2.get();
        future3.get();

        System.out.println("All dependant services finished.Starting main services.");
        executorService.shutdown();
    }
}
class DependantServices implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " Services started.");
        Thread.sleep(2000);
        return "Ok";
    }
}
