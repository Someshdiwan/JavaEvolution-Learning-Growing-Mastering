import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnfairLock {
    private final Lock unfairLock = new ReentrantLock();

    public void accessResource()
    {
        unfairLock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+ " acquired the lock.");
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
        finally
        {
            System.out.println(Thread.currentThread().getName()+ " released the lock.");
            unfairLock.unlock();
        }
    }

    public static void main(String[] args)
    {
        UnfairLock example  = new UnfairLock();

        //Runnable ka object create keya hai and Kam karwana hai accesss resources ka.
        Runnable task = new Runnable()
        {
            @Override
            public void run() {
                example.accessResource();
            }
        };
        Thread thread1 = new Thread(task,"Thrad 1");
        Thread thread2 = new Thread(task,"Thread 2");
        Thread thread3 = new Thread(task,"Thread 3");
        //3 threads created keye hai.

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
