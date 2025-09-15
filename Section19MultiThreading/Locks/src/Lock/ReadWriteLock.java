package Lock;

//ReadWriteLock allows multiple threads to read resources concurrently as long as no thread is writing to it.
//it ensures exclusive access for the write operation.(To distinguish between read and write operation)

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock {
    private int counter = 0;

    private final java.util.concurrent.locks.ReadWriteLock lock = new ReentrantReadWriteLock();

    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    public void increment() {
        writeLock.lock();
        try {
            counter++;
        } finally {
            writeLock.unlock();
        }
    }

    public int getCount() {
        readLock.lock();
        try {
            return counter;
        } finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadWriteLock counter = new ReadWriteLock();

        //Anonymous class of Runnable interface(read).
        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " read: " + counter.getClass());
                }
            }
        };

        //Anonymous class of Runnable interface(write).
        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                counter.increment();
                System.out.println(Thread.currentThread().getName() + " incremented");
            }
        };

        Thread writeThread = new Thread(writeTask);
        Thread readerThread1 = new Thread(readTask);
        Thread readerThread2 = new Thread(readTask);

        writeThread.start();
        readerThread1.start();
        readerThread2.start();

        writeThread.join();
        readerThread1.join();
        readerThread2.join();

        System.out.println("Final Count: " + counter.getCount());
    }
}
