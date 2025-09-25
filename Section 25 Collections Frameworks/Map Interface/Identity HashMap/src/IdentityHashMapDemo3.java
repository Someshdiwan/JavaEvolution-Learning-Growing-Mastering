import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo3 {
    public static void main(String[] args) {
        // Two different String objects but with same content "key"
        String key1 = new String("key");
        String key2 = new String("key");

        // IdentityHashMap → uses reference equality (==)
        Map<String, Integer> map = new IdentityHashMap<>();

        map.put(key1, 1);  // First insert
        map.put(key2, 2);  // Stored separately because key1 != key2 (different objects)

        System.out.println("IdentityHashMap Result: " + map);

        System.out.println(key1.equals(key2));
    }
}

//  Using IdentityHashMap (uses == reference comparison).

/* Difference Recap:
•	HashMap → merges both keys because key1.equals(key2) → true.

•	IdentityHashMap → keeps both entries because key1 == key2 → false.
*/
