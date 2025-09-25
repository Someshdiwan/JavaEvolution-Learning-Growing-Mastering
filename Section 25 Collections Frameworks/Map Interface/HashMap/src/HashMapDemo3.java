import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo3 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Jack");
        map.put(31, "Smith");
        map.put(11, "Shubham");
        map.put(2, "John");

        System.out.println("Original Map: " + map);

        // List of entries.
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            System.out.printf("%-3d : %-10s%n", entry.getKey(), entry.getValue());
            System.out.printf("     %-10s%n", entry.getValue().toUpperCase());
        }
        System.out.println("Final Map: " + map);
    }
}

/*
The reason the HashMap sometimes looks like it is printing in natural (sorted) order is purely coincidental and
depends on the internal hashing mechanism.

Why does it look sorted?

1. HashMap does not guarantee order
   - The order of elements depends on the hash function and how entries are placed into buckets.

2. Small number of elements
   - When there are only a few entries, it may sometimes appear sorted by chance,
     but this behavior is not reliable.

3. JDK version & HashMap implementation details
   - In some Java versions, the way the hashing algorithm and bucket assignments work
     can make the output look sorted in certain cases.
   - However, this should never be relied upon.

Conclusion:
If you need a predictable order, do not use HashMap.
Use `TreeMap` (sorted by keys) or `LinkedHashMap` (insertion order) instead.
*/
