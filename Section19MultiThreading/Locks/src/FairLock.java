import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class FairLock {
    private final Lock lock1 = new ReentrantLock(true); // Fair lock enabled means
    // Sabko thread ko run hone ka chance milega. Starvation if thread misss to run.

    public void accessResource() {
        lock1.lock(); // Correct way to acquire the lock
        try {
            System.out.println(Thread.currentThread().getName() + " acquired the lock.");
            Thread.sleep(1000); // Simulating some work
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupted status
        } finally {
            System.out.println(Thread.currentThread().getName() + " released the lock.");
            lock1.unlock(); // Correct way to release the lock
        }
    }

    public static void main(String[] args) {
        FairLock example = new FairLock();

        Runnable task = () -> example.accessResource(); // Lambda instead of Anonymous class

        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");
        Thread thread3 = new Thread(task, "Thread 3");

        try{
        // Three threads created
        thread1.start();
        Thread.sleep(50);
        thread2.start();
        Thread.sleep(100);
        thread3.start();
    } catch (Exception e){

        }
    }
}