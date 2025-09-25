import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        // 1. Normal mutable HashMap
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        System.out.println("Original mutable HashMap (map1): " + map1);

        // 2. Collections.unmodifiableMap()
        // Creates an "immutable view" of map1.
        // You can READ from map2 but cannot MODIFY it.
        // Any modification attempt (put, remove) will throw UnsupportedOperationException.
        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);

        System.out.println("Immutable view created from map1 (map2): " + map2);

        // NOTE: If you change map1, map2 also reflects changes (because it's a wrapper, not a deep copy).
        map1.put("C", 3);
        System.out.println("After modifying map1 -> map1: " + map1);
        System.out.println("After modifying map1 -> map2: " + map2); // Reflects the new entry

        // map2.put("D", 4); // This will throw UnsupportedOperationException

        // 3. Map.of() (Java 9+)
        // Directly creates an immutable map.
        // Limitation: Can accept only up to 10 entries.
        // Once created, it cannot be modified.
        Map<String, Integer> map3 = Map.of("Shubham", 98, "Vivek", 89);

        System.out.println("Immutable Map created with Map.of(): " + map3);

        // map3.put("Akshit", 88); // Throws UnsupportedOperationException

        // 4. Map.ofEntries() (Java 9+)
        // A more flexible way of creating immutable maps.
        // Allows creating with many entries (more than 10 if required).
        Map<String, Integer> map4 = Map.ofEntries(
                Map.entry("Akshit", 99),
                Map.entry("Vivek", 99),
                Map.entry("Neha", 95)
        );

        System.out.println("Immutable Map created with Map.ofEntries(): " + map4);

        System.out.println("\nSummary:");
        System.out.println("map1 is mutable → can be changed.");
        System.out.println("map2 is immutable view of map1 → changes in map1 are reflected, "
                + "but direct modification on map2 is not allowed.");
        System.out.println("map3 is truly immutable → no changes allowed (up to 10 entries).");
        System.out.println("map4 is truly immutable → no changes allowed, supports >10 entries.");
    }
}
