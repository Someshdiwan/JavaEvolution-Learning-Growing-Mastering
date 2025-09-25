import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapAccessOrderDemo {
    public static void main(String[] args) {
        // LinkedHashMap with access-order enabled (true).
        // Constructor params → (initialCapacity=11, loadFactor=0.3f, accessOrder=true)
        // accessOrder = true → Entries are reordered whenever accessed (get/put).
        // threshold = capacity × loadFactor
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11, 0.3f, true);

        // Insertion of entries
        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Guava", 13);

        // Multiple get() calls reorder the entries in access order.
        // The most recently accessed entry always moves to the END.
        linkedHashMap.get("Apple");
        linkedHashMap.get("Orange");
        linkedHashMap.get("Guava");
        /*
        linkedHashMap.get("Apple");
        linkedHashMap.get("Orange");
        linkedHashMap.get("Apple");
        linkedHashMap.get("Guava");
        */

        // Iteration now respects *access order*.
        // That means the order you see here is not insertion order,
        // but the order in which elements were last accessed.
        System.out.println("LinkedHashMap (access order):");

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

/* LinkedHashMap = HashMap + Doubly Linked List + Configurable access order.
•	LinkedHashMap does guarantee ordering:
•	If accessOrder=false → preserves insertion order.
•	If accessOrder=true → preserves access order (most recently accessed entries go to the end).

Theory: LinkedHashMap with accessOrder = true

1. Insertion order is NOT preserved here. Instead, entries are reordered based on *access*.
2. Each time you do get(key) or put(key, value):
   → That entry moves to the END of the doubly-linked list.
3. This is how LinkedHashMap can be used to implement LRU Cache:
   - The least recently used entries stay at the beginning.
   - The most recently accessed entries move to the end.

•	HashMap → No ordering (entries are placed in buckets based on hash).

•	LinkedHashMap → Ordering is guaranteed:
•	accessOrder=false → insertion order.
•	accessOrder=true → access order.
*/
