import java.util.NavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * Small demo class to complement {@link ConcurrentHashMapDemo}.

 * <p>
 * ConcurrentSkipListMap provides a thread-safe sorted map (ordered by natural ordering
 * or provided Comparator). It is a scalable concurrent alternative to TreeMap when you
 * need both ordering and concurrency.
 * </p>

 * <p>
 * This class provides a minimal stand-in for documentation purposes and for the
 * {@code @see} reference in {@link ConcurrentHashMapDemo}. It intentionally contains
 * only a short example that prints a small concurrent, sorted map.
 * </p>
 */

public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {
        // Create a thread-safe, sorted map backed by a skip list.
        NavigableMap<Integer, String> skipListMap = new ConcurrentSkipListMap<>();

        // Populate with a few entries (kept simple for demonstration).
        skipListMap.put(2, "Two");
        skipListMap.put(1, "One");
        skipListMap.put(3, "Three");

        // Prints the map (will be in sorted key order: 1, 2, 3).
        System.out.println(skipListMap);
    }
}
