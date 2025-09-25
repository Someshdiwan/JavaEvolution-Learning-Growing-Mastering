import java.util.concurrent.CopyOnWriteArraySet;

/*
 * Theory and notes:
 * - CopyOnWriteArraySet is a thread-safe Set implementation backed by a CopyOnWriteArrayList.
 * - Write (add/remove) operations create a fresh copy of the underlying array. Reads iterate over
 *   a snapshot of the array that was current when the iterator was created.
 * - Iterators are safe from ConcurrentModificationException and do not reflect modifications
 *   that occur after the iterator was created. They iterate over the snapshot taken at creation time.

 * Trade-offs:
 * - Ideal for situations with many readers and few writers (read-mostly workloads).
 * - Writes are expensive (copy an entire array), memory usage increases temporarily on writes.
 * - Provides strong thread-safety without explicit locks for read operations.

 * Example behavior shown:
 * - We iterate the set and attempt to add an element while iterating.
 * - Because CopyOnWriteArraySet uses snapshot iterators, the new element will not appear
 *   during the current iteration.
 */

public class CopyOnWriteArraySetDemoIMP {
    public static void main(String[] args) {
        // Thread-safe set with copy-on-write semantics
        CopyOnWriteArraySet<Integer> copyOnWriteSet = new CopyOnWriteArraySet<>();

        for (int i = 1; i <= 5; i++) {
            copyOnWriteSet.add(i);
        }

        System.out.println("Initial CopyOnWriteArraySet: " + copyOnWriteSet);

        System.out.println("\nIterating and modifying CopyOnWriteArraySet:");
        for (Integer num : copyOnWriteSet) {
            System.out.println("Reading from CopyOnWriteArraySet: " + num);

            // Attempting to modify the set during iteration.
            // This triggers a copy of the underlying array, but the iterator keeps iterating
            // over the snapshot, so the newly added element will not be seen in this loop.
            copyOnWriteSet.add(6);
        }

        // After the iteration finishes, the set will contain the newly added element.
        System.out.println("\nAfter iteration, CopyOnWriteArraySet content: " + copyOnWriteSet);
    }
}
