import java.util.HashMap;

public class HashMapOrderDemo {
    public static void main(String[] args) {

        // Create a HashMap (default capacity 16, load factor 0.75)
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Put elements into the HashMap
        hashMap.put("Shubham", 91);
        hashMap.put("Bob", 80);
        hashMap.put("Akshit", 78);

        // getOrDefault: returns value if key exists; otherwise returns default (0 here).
        Integer res = hashMap.getOrDefault("Vipul", 0);

        // Update the value for "Shubham" (replaces old value).
        hashMap.put("Shubham", 92);

        // Print HashMap
        System.out.println("HashMap contents: " + hashMap);

        /*
         * Important: HashMap does NOT guarantee order of keys.
         * Why?
         *  - Internally, entries are stored in buckets (based on hashCode).
         *  - Iteration goes bucket by bucket, not in insertion order.
         *  - Therefore, output order may look random, may differ across runs or JDK versions.

         * Example Output:
         *   {Akshit=78, Shubham=92, Bob=80}

         * But order is NOT reliable or predictable.
         */
    }
}

/* Theory: HashMap Order

1. HashMap uses hashing → elements go into buckets based on hashCode().
2. Because bucket placement is not related to insertion sequence,
   iteration does NOT preserve insertion order.
3. If you need guaranteed order:
   - Use LinkedHashMap (insertion-order or access-order).
   - Or use TreeMap (sorted order).
*/
