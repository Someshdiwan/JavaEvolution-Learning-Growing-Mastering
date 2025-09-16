import java.util.concurrent.*;

/*
 Alternative (same idea implemented elsewhere):
 See a project file: Section19MultiThreading/ThreadPooling/ExecutorsFramework/ExecutorsServices/src/Main2.java
*/

public class Main2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfServices = 3;

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);
        CountDownLatch latch = new CountDownLatch(numberOfServices);

        executorService.submit(new DependantServices(latch));
        executorService.submit(new DependantServices(latch));
        executorService.submit(new DependantServices(latch));

        latch.await();

        System.out.println("Main");
        executorService.shutdown();
    }
}

class DependantServices implements Callable<String> {
    private final CountDownLatch latch;

    public DependantServices(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public String call() throws Exception {
        try {
            System.out.println(Thread.currentThread().getName() + " Services started.");
            Thread.sleep(2000);
        } finally {
            latch.countDown();
        }
        return "Ok";
    }
}
