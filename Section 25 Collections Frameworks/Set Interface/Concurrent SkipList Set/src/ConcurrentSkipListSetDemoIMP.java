import java.util.concurrent.ConcurrentSkipListSet;

/* Theory and notes:
 * - ConcurrentSkipListSet is a scalable, concurrent, sorted Set implementation.
 * - Internally it uses a concurrent skip list (a probabilistic layered linked structure).
 * - Provides expected average O(log n) time cost for contains, add, remove and navigation operations.
 * - It is ordered (natural order or custom comparator), and supports concurrent access by multiple threads.
 * - Iterators are "weakly consistent": they reflect some (but not necessarily all) updates that
 *   happened after the iterator was created; they do not throw ConcurrentModificationException.

 * Trade-offs:
 * - Good for concurrent, sorted sets where many threads read and write.
 * - Slightly heavier than hash-based sets for single-threaded access, but much better concurrency.

 * Example behavior shown:
 * - We iterate the concurrent set and attempt to add an element while iterating.
 * - The iterator is weakly consistent: it may or may not reflect the newly added element during iteration,
 *   but it will not throw ConcurrentModificationException.

 * ASCII (conceptual) for a skip list with levels:
 *
 * Level 2:    null  --> [50] ----------------------------> null
 * Level 1:    null  --> [30] -------> [50] -------------> null
 * Level 0: head -> [10] -> [20] -> [30] -> [40] -> [50] -> null

 * Lookups jump levels to quickly skip ahead; expected cost ~ O(log n).
 */

public class ConcurrentSkipListSetDemoIMP {
    public static void main(String[] args) {
        // Thread-safe sorted set based on a concurrent skip list
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for (int i = 1; i <= 5; i++) {
            concurrentSkipListSet.add(i);
        }
        System.out.println("Initial ConcurrentSkipListSet: " + concurrentSkipListSet);

        System.out.println("\nIterating and modifying ConcurrentSkipListSet:");
        for (Integer num : concurrentSkipListSet) {
            System.out.println("Reading from ConcurrentSkipListSet: " + num);

            // Attempting to modify the set during iteration.
            // Iterators are weakly consistent: they will not throw ConcurrentModificationException,
            // and they may or may not reflect the new element during this iteration.
            concurrentSkipListSet.add(6);
        }
        // After the iteration finishes, the set will contain the newly added element.
        System.out.println("\nAfter iteration, ConcurrentSkipListSet content: " + concurrentSkipListSet);
    }
}
