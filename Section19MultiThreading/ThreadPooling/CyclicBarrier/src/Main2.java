import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main2 {
    public static void main(String[] args) {
        int numberOfSubsystems = 4;

        // Barrier action: runs once when all subsystems reach the barrier
        CyclicBarrier barrier = new CyclicBarrier(numberOfSubsystems, () ->
                System.out.println("All subsystems are up and running. System startup complete.")
        );

        Thread webServerThread = new Thread(new Subsystem("Web Server", 2000, barrier));
        Thread databaseThread  = new Thread(new Subsystem("Database", 4000, barrier));
        Thread cacheThread     = new Thread(new Subsystem("Cache", 3000, barrier));
        Thread messagingThread = new Thread(new Subsystem("Messaging Service", 3500, barrier));

        webServerThread.start();
        databaseThread.start();
        cacheThread.start();
        messagingThread.start();
    }
}

class Subsystem implements Runnable {
    private final String name;
    private final int initializationTime;
    private final CyclicBarrier barrier;

    public Subsystem(String name, int initializationTime, CyclicBarrier barrier) {
        this.name = name;
        this.initializationTime = initializationTime;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " starting initialization...");
            Thread.sleep(initializationTime); // simulate initialization work
            System.out.println(name + " initialization complete. Waiting at barrier...");
            barrier.await(); // wait for other subsystems to be ready
            System.out.println(name + " proceeding after barrier.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println(name + " was interrupted.");
        } catch (BrokenBarrierException e) {
            System.err.println(name + " barrier broken: " + e.getMessage());
        }
    }
}
