public class MethodsInThread2 {
    public static void main(String[] args) {
        MethodsInThread2 obj = new MethodsInThread2();

        Thread t1 = new Thread(() -> obj.taskOne(), "Thread-1");
        Thread t2 = new Thread(() -> obj.taskTwo(), "Thread-2");

        t1.start();
        t2.start();
    }

    // Method 1 executed by Thread-1.
    public void taskOne() {
        System.out.println(Thread.currentThread().getName() + " is starting Task One.");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Task One - Step " + i);
            sleepOneSecond();
        }
        System.out.println(Thread.currentThread().getName() + " completed Task One.");
    }

    // Method 2 executed by Thread-2.
    public void taskTwo() {
        System.out.println(Thread.currentThread().getName() + " is starting Task Two.");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Task Two - Step " + i);
            sleepOneSecond();
        }
        System.out.println(Thread.currentThread().getName() + " completed Task Two.");
    }

    // Helper method to pause the thread.
    private void sleepOneSecond() {
        try {
            Thread.sleep(1000);  // Sleep for 1 second
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread was interrupted");
        }
    }
}
