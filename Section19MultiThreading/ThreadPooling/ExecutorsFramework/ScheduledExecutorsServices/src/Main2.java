import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {
    public static void main(String[] args) {
        /*
         * newFixedThreadPool(int nThreads):
         * ---------------------------------
         * - Creates a thread pool with a fixed number of threads.
         * - If all threads are busy, new tasks wait in a queue until a thread becomes free.
         * - Suitable when the number of threads should be constant,
         *   e.g., controlling parallelism or limiting resource usage.

         *   Ek fixed size ka thread pool banata hai.
         *   Agar saare threads busy ho jayein, to naye tasks queue mein wait karte hain
         *   jab tak koi thread free na ho jaye.
         *   Isko tab use karo jab threads ki count constant rakhni ho,
         *   jaise limited parallelism ya resource control ke liye.
         */
        Executors.newFixedThreadPool(2);

        /*
         * newCachedThreadPool():
         * ----------------------
         * - Creates a thread pool that dynamically adjusts the number of threads
         *   based on demand.
         * - New threads are created as needed, and idle threads are reused if available.
         * - Suitable for applications with a large number of short-lived tasks
         *   or workloads that vary significantly.
         *
         *   Ek aisa thread pool banata hai jo dynamically threads ko adjust karta hai.
         *   Jitne tasks aate hain, utne threads create kar deta hai (agar free threads available
         *   ho to unhe reuse karta hai).
         *   Ye short-lived tasks ke liye best hai, ya jab workload variable ho
         *   (kabhi zyada load, kabhi kam load).
         */
        ExecutorService executorService = Executors.newCachedThreadPool();
    }
}
