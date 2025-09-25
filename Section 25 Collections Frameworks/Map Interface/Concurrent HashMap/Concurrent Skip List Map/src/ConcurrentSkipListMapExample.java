import java.util.Map;
import java.util.NavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapExample {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();

        // Put some entries (not blocking)
        map.put(50, "fifty");
        map.put(10, "ten");
        map.put(30, "thirty");
        map.put(70, "seventy");

        // Start writers concurrently
        Thread writer1 = new Thread(() -> {
            for (int i = 1; i <= 100; i += 2) {
                map.put(i, "v" + i);
            }
        }, "writer-odd");

        Thread writer2 = new Thread(() -> {
            for (int i = 2; i <= 100; i += 2) {
                map.put(i, "v" + i);
            }
        }, "writer-even");

        writer1.start();
        writer2.start();

        // Meanwhile, iterate using weakly consistent iterator
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
            // Note: iteration may miss or include concurrent updates
        }

        writer1.join();
        writer2.join();

        // After writers finish, map is sorted
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());

        // Get a subMap view (sorted)
        NavigableMap<Integer, String> sub = map.subMap(10, true, 30, true);
        System.out.println("Submap [10..30]: " + sub);
    }
}
