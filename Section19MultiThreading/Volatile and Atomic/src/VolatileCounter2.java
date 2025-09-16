import java.util.concurrent.atomic.AtomicInteger;

public class VolatileCounter2 {
    //private int counter = 0;
    //private volatile int counter = 0;

    private AtomicInteger counter = new AtomicInteger(0);
    //Thread safe. ek baar mai bas ek thread kaam karega. u also use synchronization and lock.

    public void increament() {
        //counter++;

        int i = counter.incrementAndGet();
    }

    public int getCounter() {
        //return counter;

        return counter.get();
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileCounter2 vc2 = new VolatileCounter2();

        Thread t3 = new Thread(() -> {
            for(int i=0; i<1000; i++) {
                vc2.increament();
            }
        });

        Thread t4 = new Thread(() -> {
            for(int i=0; i<1000; i++) {
                vc2.increament();
            }
        });

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println(vc2.getCounter());
    }
}

/*
===========================
 volatile vs AtomicInteger
===========================

1. volatile int counter = 0;
   - Threads ko latest value dikhegi.
   - Lekin counter++ is NOT atomic (read + add + write).
   - Example: Thread A and B dono read karte hain same old value,
     dono increment karte hain -> ek update lost ho jaata hai.

2. AtomicInteger counter = new AtomicInteger(0);
   - Methods like incrementAndGet(), getAndAdd() are atomic.
   - Internal implementation uses CAS (Compare-And-Swap).
   - No lost updates, thread-safe without explicit locks.

3. Alternative:
   - synchronized methods ya ReentrantLock use kar sakte ho,
     lekin AtomicInteger zyada lightweight aur efficient hota hai
     simple counters ke liye.
*/
