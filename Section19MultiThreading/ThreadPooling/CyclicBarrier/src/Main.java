import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfServices = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);

        CyclicBarrier barrier = new CyclicBarrier(numberOfServices,
                () -> System.out.println("All services are ready. Proceeding..."));

        executorService.submit(new DependantServices(barrier));
        executorService.submit(new DependantServices(barrier));
        executorService.submit(new DependantServices(barrier));

        System.out.println("Main thread waiting...");
        executorService.shutdown();
    }
}

class DependantServices implements Callable<String> {
    private final CyclicBarrier barrier;

    public DependantServices(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " Service started.");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " is waiting at the barrier...");
        barrier.await(); // wait until all threads reach the barrier
        return Thread.currentThread().getName() + " finished.";
    }
}
