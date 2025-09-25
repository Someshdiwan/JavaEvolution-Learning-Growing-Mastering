import java.util.concurrent.ConcurrentHashMap;

/**
 * Demonstrates the basic usage of {@link ConcurrentHashMap} with the exact
 * logic you had originally.
 *
 * <p>
 * This class contains a short example showing two puts and a println of the map.
 * The example is intentionally minimal to keep the logic unchanged while providing
 * detailed documentation about the internal locking/implementation evolution:
 * </p>
 *
 * <ul>
 *   <li><b>Java 7:</b> ConcurrentHashMap used segment-based locking (multiple segments,
 *       each a small hash table). Writes locked only the affected segment.</li>
 *   <li><b>Java 8:</b> Implementation moved to a lock-free / CAS-based design for most
 *       operations (still needs synchronization for table resize and some collision cases).
 *       This yields better concurrency and throughput.</li>
 * </ul>
 */

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap (thread-safe map implementation).
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        /*
         * Put two entries into the map.
         * NOTE: This logic is kept exactly as in the original snippet (no changes).
         */
        map.put("World", 2);
        map.put("Hello", 1);

        /*
         * Print the current map contents to standard output.
         * The printed order is not guaranteed; ConcurrentHashMap is not ordered.
         */
        System.out.println(map);
    }
}
