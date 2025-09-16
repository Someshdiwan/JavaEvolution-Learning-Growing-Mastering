import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// ScheduledExecutorService ka use tab hota hai jab apko koi task
// periodically (repeat interval par) ya ek specific delay ke baad run karna ho.

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

         // Different scheduling methods available:
        // scheduler.schedule(...)            -> ek specific delay ke baad run
        // scheduler.scheduleAtFixedRate(...) -> fix interval ke saath run (start times fixed)
        // scheduler.scheduleWithFixedDelay() -> ek task ke end ke baad delay dekar next run

        // Example: Task har 5 seconds ke fixed rate par execute hoga.
        scheduler.scheduleAtFixedRate(() ->
                System.out.println("Task executed after Every 5 seconds delay !"),
                5,
                5,
                TimeUnit.SECONDS);

        scheduler.schedule( () ->
        {
            System.out.println("Initiating shutdown...");
            scheduler.shutdown();
        }, 20, TimeUnit.SECONDS);

        //scheduler.shutdown();
    }
}
