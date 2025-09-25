import java.util.concurrent.ConcurrentSkipListMap;

/**
 * Demonstrates the usage of {@link ConcurrentSkipListMap}.

 * <p>
 * Key points about ConcurrentSkipListMap:
 * <ul>
 *   <li>A scalable concurrent implementation of {@code ConcurrentNavigableMap}.</li>
 *   <li>MAP --> SORTED --> THREAD SAFE --> ConcurrentSkipListMap</li>
 *   <li>Maintains keys in <b>sorted order</b> (natural ordering or a custom {@code Comparator}).</li>
 *   <li>Internally implemented using a <b>concurrent variant of SkipLists</b>.</li>
 *   <li>Provides expected average <b>O(log n)</b> time cost for operations like
 *       {@code containsKey()}, {@code get()}, {@code put()}, and {@code remove()}.</li>
 *   <li>Supports safe concurrent access — multiple threads can insert, remove,
 *       update, or traverse without external synchronization.</li>
 * </ul>
 * </p>
 */

public class ConcurrentSkipListMapDemo1 {
    public static void main(String[] args) {
        /* Create a ConcurrentSkipListMap.
           - Thread-safe
           - Maintains keys in sorted order
        */
        ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();

        // Insert key-value pairs into the map.
        map.put("Apple", 2);
        map.put("Banana", 4);
        map.put("Mango", 3);

        /* Print the map.
        * Output will be sorted by keys (lexicographic order):
        * {Apple=2, Banana=4, Mango=3}
        */
        System.out.println(map);
    }
}
