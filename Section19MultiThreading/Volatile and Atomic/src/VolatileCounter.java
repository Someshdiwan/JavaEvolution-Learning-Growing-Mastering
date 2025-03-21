import java.util.concurrent.atomic.AtomicInteger;

public class VolatileCounter {

    private AtomicInteger counter = new AtomicInteger(0);

    public void increament(){
        counter.incrementAndGet();

    /*private volatile int counter = 0;

    public void increament(){
        counter++;
    */

    }

    /*
    synchronized

    Remove this synchronized and check the output.
    othewise add volatile to the counter. Still not get 2000 using volatile.
    Isko Bolte Atomicity. Har ek operation isolated rahe.
    Java provides class to ensure a atomic city. like
    atomic integer, atomic long, atomic boolean without using lock to achive isolationa and atomiccity
    */

    public int getCounter(){
        return counter.get();

        /* return counter;*/
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileCounter vc = new VolatileCounter();
        Thread t1 = new Thread(() -> {
            for(int i = 0; i<1000; i++){
                vc.increament();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i<1000; i++){
                vc.increament();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(vc.getCounter());
    }
}