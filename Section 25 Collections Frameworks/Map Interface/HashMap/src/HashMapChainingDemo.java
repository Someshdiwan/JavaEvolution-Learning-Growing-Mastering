import java.util.LinkedList;
import java.util.List;

/**
 * Simple custom HashMap-like demo to show chaining using LinkedList.
 * Uses a very simple hash function (sum of chars % capacity) to force collisions.

 * chaining (LinkedList) inside a custom HashMap so you can see collisions and how entries chain inside a bucket.
 */

public class HashMapChainingDemo {

    // Entry to store key-value pairs
    static class Entry {
        String key;
        Integer value;

        Entry(String k, Integer v) { key = k; value = v; }

        @Override
        public String toString() {
            return key + "=" + value;
        }
    }

    // Very small hash-table with chaining
    static class SimpleHashMap {
        private final List<Entry>[] buckets;

        @SuppressWarnings("unchecked")
        SimpleHashMap(int capacity) {
            buckets = new List[capacity];
            for (int i = 0; i < capacity; i++) buckets[i] = new LinkedList<>();
        }

        // Simple hash: sum of characters modulo capacity (intentionally simple to cause collisions)
        private int simpleHash(String key) {
            int sum = 0;
            for (char c : key.toCharArray()) sum += (int) c;
            return Math.abs(sum) % buckets.length;
        }

        // put (insert or update)
        public void put(String key, Integer value) {
            int idx = simpleHash(key);
            List<Entry> bucket = buckets[idx];
            for (Entry e : bucket) {
                if (e.key.equals(key)) {
                    e.value = value; // update existing
                    return;
                }
            }
            bucket.add(new Entry(key, value)); // add new
        }

        // get
        public Integer get(String key) {
            int idx = simpleHash(key);
            List<Entry> bucket = buckets[idx];
            for (Entry e : bucket) {
                if (e.key.equals(key)) return e.value;
            }
            return null;
        }

        // print all buckets and chains
        public void printBuckets() {
            System.out.println("Buckets (index -> chain):");
            for (int i = 0; i < buckets.length; i++) {
                System.out.print(i + " -> ");
                if (buckets[i].isEmpty()) {
                    System.out.println("null");
                } else {
                    System.out.println(buckets[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        SimpleHashMap map = new SimpleHashMap(5); // small capacity to force collisions

        // Keys chosen so some will collide with our simple hash
        map.put("ABC", 10);
        map.put("CBA", 20); // likely collision with "ABC"
        map.put("BAC", 30); // likely collision too
        map.put("HELLO", 99);
        map.put("OLLEH", 100); // likely collision with HELLO

        // print bucket chains
        map.printBuckets();

        // show get() behavior
        System.out.println("\nLookups:");
        System.out.println("ABC -> " + map.get("ABC"));
        System.out.println("CBA -> " + map.get("CBA"));
        System.out.println("BAC -> " + map.get("BAC"));
        System.out.println("HELLO -> " + map.get("HELLO"));
        System.out.println("OLLEH -> " + map.get("OLLEH"));
    }
}

/*
1. Kya dikhaya ja raha hai:
- Ye SimpleHashMap ek chhota demo hai jo chaining (LinkedList) dikhata hai jab collisions hoti hain.
- Hum intentionally simple hash use kar rahe hain (sum of chars % capacity) taaki collisions aasan se ho.

2. Bucket + Chaining:
- Map ke andar ek array hota hai: buckets[]
- Har bucket ek LinkedList (chain) rakhta hai of Entry objects.
- Jab multiple keys same bucket index pe aati hain → woh LinkedList me chain ho jaati hain.

3. put() ka flow:
- key ka hash index nikalte hain (simpleHash).
- us bucket ko traverse karte hain:
   - agar key mil jaaye → value update kar do.
   - nahi mili → bucket ke end me naya Entry add kar do.

4. get() ka flow:
- key ka index nikal ke us bucket ki LinkedList traverse karte hain.
- matching key milte hi value return kar do.

5. Kyun important hai:
- Real `java.util.HashMap` bhi similar chaining use karta tha (linked list),
aur Java 8+ me jab chain bahut lambi ho jati hai to woh tree me convert kar leta hai.
- Agar sab keys same bucket me chali jaayein (bahut collisions) to search cost O(n)
ho jaata hai — isliye acha hash function zaroori hai.

6. ASCII example (expected, capacity=5):

Suppose simpleHash("ABC") = 3
        simpleHash("CBA") = 3
        simpleHash("BAC") = 3

Buckets:
0 -> null
1 -> null
2 -> null
3 -> [ABC=10, CBA=20, BAC=30]
4 -> [HELLO=99, OLLEH=100]

7. Quick Recap:
- Chaining = collisions ke liye safe strategy.
- Each bucket holds a linked list of entries.
- get/put average O(1) (if hash distribution is good), worst-case O(n) (if many collisions).
*/
