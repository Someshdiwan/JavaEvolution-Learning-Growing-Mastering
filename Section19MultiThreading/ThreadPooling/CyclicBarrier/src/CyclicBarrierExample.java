import java.util.concurrent.*;

public class CyclicBarrierExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int numberOfServices = 3;

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);

        CyclicBarrier barrier = new CyclicBarrier(numberOfServices,
                () -> System.out.println("All services are up. Proceeding with main execution."));

        executorService.submit(new DependentService(barrier));
        executorService.submit(new DependentService(barrier));
        executorService.submit(new DependentService(barrier));

        System.out.println("Main");
        barrier.getParties();
        //executorService.shutdown();
    }

    static class DependentService implements Callable<String> {
        private CyclicBarrier barrier;

        public DependentService(CyclicBarrier barrier) {
            this.barrier = barrier;
        }
        @Override
        public String call() throws Exception {
            System.out.println(Thread.currentThread().getName() + " service started.");
            Thread.sleep(6000);
            System.out.println(Thread.currentThread().getName() + " service completed.");
            barrier.await();  // Wait at the barrier
            return "Ok";
        }
    }
}
