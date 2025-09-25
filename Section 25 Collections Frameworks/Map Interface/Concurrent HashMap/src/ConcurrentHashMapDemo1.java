import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/**
 * Demonstrates concurrent updates to a ConcurrentHashMap using two threads.

 * What this program does:
 * - Thread t1 inserts 1000 distinct keys: A0..A999 with values 0..999 via put (thread-safe).
 * - Thread t2 inserts up to 500 distinct keys: B0..B499 using computeIfAbsent, which is atomic per key.
 *   It loops 1000 times, but because the key is computed as B+(i % 500), each B-key is attempted twice;
 *   only the first attempt creates the mapping, the second is ignored since the key already exists.

 * Therefore, the final map size is expected to be 1000 (A-keys) + 500 (B-keys) = 1500.

 * Notes on concurrency behavior:
 * - ConcurrentHashMap allows high concurrency for reads and writes without locking the entire map.
 * - computeIfAbsent executes the mapping function at most once per key in a thread-safe manner.
 * - The map does not preserve the insertion order; the printed order is unspecified.
 */

public class ConcurrentHashMapDemo1 {
    public static void main(String[] args) throws InterruptedException {
        // Initial capacity set to 16; CHM grows as needed. No need for extra synchronization.
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>(16);

        // Two threads will concurrently put values
        CountDownLatch latch = new CountDownLatch(2);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put("A" + i, i);
            }
            latch.countDown();
        }, "producer-A");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                // computeIfAbsent is atomic per key
                final int val = i; // effectively final for lambda capture
                map.computeIfAbsent("B" + (i % 500), k -> val);
            }
            latch.countDown();
        }, "producer-B");

        t1.start();
        t2.start();
        // Wait until both threads finish inserting
        latch.await();

        int expectedSize = 1000 + 500;
        System.out.println("Expected size: " + expectedSize);
        System.out.println("Actual size:   " + map.size());
        System.out.println("Sample get A10: " + map.get("A10"));
        System.out.println("Sample get B10: " + map.get("B10"));
    }
}
