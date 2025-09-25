import java.util.Hashtable;

/**
 * Demonstrates thread-safety in {@link Hashtable}.
 *
 * <p>
 * Key Points:
 * <ul>
 *   <li>Hashtable is synchronized → all its methods (including get/put) are thread-safe.</li>
 *   <li>Multiple threads can update the Hashtable concurrently without corrupting data.</li>
 *   <li>However, synchronization can cause performance overhead compared to non-synchronized maps like HashMap.</li>
 * </ul>
 *
 * @author Somesh Diwan
 */

public class ThreadSafeHashTable {
    public static void main(String[] args) {
        /*
          Concurrency in Hashtable:
          - Unlike HashMap, Hashtable is thread-safe.
          - Every method (including get() and put()) is synchronized.
          - This ensures safe usage across multiple threads but makes it slower in single-threaded use cases.
        */
        Hashtable<Integer, String> map = new Hashtable<>();

        // The first thread inserts keys from 0 to 1000
        Thread newThread1 = new Thread(() -> {
            for (int i = 0; i <= 1000; i++) {
                map.put(i, "New Thread1 Running");
            }
        });

        // The second thread inserted keys from 1000 to 1999
        Thread thread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                map.put(i, "Thread2");
            }
        });

        // Start both threads
        newThread1.start();
        thread2.start();

        // Wait for both threads to complete
        try {
            newThread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // The final size will be 2000 (keys 0–1999) — proving thread safety.
        System.out.println("Final size of HashTable: " + map.size());
    }
}
