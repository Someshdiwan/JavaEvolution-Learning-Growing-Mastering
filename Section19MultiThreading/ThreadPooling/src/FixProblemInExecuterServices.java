import java.util.concurrent.*;

public class FixProblemInExecuterServices {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //ExecutorService executorService = Executors.newFixedThreadPool(3);

        int numberOfServices = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);

        CountDownLatch latch = new CountDownLatch(numberOfServices);

        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        latch.await();

        System.out.println("Main");
        executorService.shutdown();


/*        //Creating 3 Threads. Alternate Method written above check it out.
        Future<String> future1 = executorService.submit(new DependentService());
        Future<String> future2 = executorService.submit(new DependentService());
        Future<String> future3 = executorService.submit(new DependentService());

        future1.get();
        future2.get();
        future3.get();


        System.out.println("All Dependent services finished. Starting main service...");
        executorService.shutdown();*/
    }


    static class DependentService implements Callable<String> {
        private CountDownLatch latch;

        // Constructor
        public DependentService(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public String call() throws Exception {
            try {
                System.out.println(Thread.currentThread().getName() + " service started.");
                Thread.sleep(2000);
            } finally {
                latch.countDown();
            }
            return "Ok";
        }
    }
}

/*
        @Override
        public String call() throws Exception {
            System.out.println(Thread.currentThread().getName() + " service started.");
            Thread.sleep(2000);
            return "Ok";
        }
    }
}
*/