import java.sql.Time;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfServices = 3;
        CountDownLatch latch = new CountDownLatch(numberOfServices);

        for(int i =0; i<numberOfServices; i++) {
            new Thread(new DependantServices2(latch)).start();
        }
        latch.await(5, TimeUnit.SECONDS);
        System.out.println("Main");
    }
}

class DependantServices2 implements Runnable {
    private final CountDownLatch latch;

    public DependantServices2(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        try {
            Thread.sleep(6000);
            System.out.println(Thread.currentThread().getName() + " Services started.");
        }
        catch(Exception e){

        }
        finally {
            latch.countDown();
        }
    }
}

/*
CountDownLatch ka use:

Jab multiple threads complete hone ka wait karwana ho main thread ko.
Ek baar count zero ho gaya to latch reuse nahi hota (non-reusable).

- Jab main thread ko wait karwana ho ki multiple worker threads apna kaam complete karein.
 Example: 3 services start hone ke baad hi main thread aage chale.

- latch.countDown() har worker ke complete hone par counter ko 1 decrement karta hai.
Jab yeh counter zero ho jata hai, tab main thread jo await() par rukha hai, wo release ho jata hai.

Limitation: CountDownLatch non-reusable hai.
Ek baar count zero tak pahunch gaya to usse reset karke dobara use nahi kar sakte.
Agar reusable barrier chahiye to CyclicBarrier ya Phaser use karna better hota hai.
*/
