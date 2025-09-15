public class MethodsInThread {
    public static void main(String[] args) {
        MethodsInThread obj = new MethodsInThread();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                obj.performTask();
            }
        };
        Thread thread = new Thread(task, "Worker Thread");
        thread.start();
    }

    // Method executed by the thread.
    public void performTask() {
        System.out.println(Thread.currentThread().getName() + " is starting the task.");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Step " + i + " performed by " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);  // Simulate time-consuming task.
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted");
            }
        }
        System.out.println(Thread.currentThread().getName() + " completed the task.");
    }
}
