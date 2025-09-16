import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    public static void main(String[] args) throws InterruptedException {
        // AtomicInteger: ek atomic counter jo thread-safe hai
        AtomicInteger counter = new AtomicInteger(0);

        // Thread 1: increments 1000 times
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementAndGet(); // atomic increment
            }
        });

        // Thread 2: increments 1000 times
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementAndGet(); // atomic increment
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        //Final result always 2000 (race condition nahi hoga)
        System.out.println("Final counter value: " + counter.get());
    }
}

/*
Why AtomicInteger?
- Agar simple int + volatile use karte:
    counter++;
    Yeh do steps hai: read -> add -> write
    Multiple threads me lost updates ho jaati hai (result unpredictable).

- AtomicInteger methods:
    - incrementAndGet()   -> ++counter (atomic)
    - getAndIncrement()   -> counter++ (atomic)
    - addAndGet(n)        -> counter += n (atomic)
    - get()               -> safe read

- Internally, AtomicInteger CAS (Compare-And-Swap) ka use karta hai.
  Matlab ek hi thread successful hota hai update karne me, 
  baaki retry karte hain.
*/
