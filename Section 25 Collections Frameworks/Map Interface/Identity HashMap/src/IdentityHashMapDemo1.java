import java.util.IdentityHashMap;
import java.util.Map;

/* Purpose:
- Demonstrates how IdentityHashMap treats keys based on reference identity (==),
  not logical equality (.equals()).
- Shows that two distinct String objects with identical content are treated
  as separate keys by IdentityHashMap.
*/

public class IdentityHashMapDemo1 {
    public static void main(String[] args) {
        // IdentityHashMap uses reference-equality for keys (k1 == k2)
        Map<String, Integer> identityMap = new IdentityHashMap<>();

        // For comparison, regular HashMap (uses equals() for key equality)
        Map<String, Integer> hashMap = new java.util.HashMap<>();

        // Create two distinct String objects with same content.
        // Using 'new String(...)' ensures they are different objects in memory.
        String key1 = new String("Hello");
        String key2 = new String("Hello");  // new object, same content

        // Put into IdentityHashMap: both entries will be stored because key1 != key2 (by reference)
        identityMap.put(key1, 100);
        identityMap.put(key2, 200);

        // Put into HashMap: key2 will overwrite key1 because key1.equals(key2) == true
        hashMap.put(key1, 100);
        hashMap.put(key2, 200);

        System.out.println("IdentityHashMap: " + identityMap);
        // Expected: {Hello=100, Hello=200}  (two entries — keys are different objects)

        System.out.println("HashMap: " + hashMap);
        // Expected: {Hello=200}  (single entry — second put overwrote first)
    }
}
