package CustomHashMap;

/* Test runner for HashMapCustom. */

public class HashMapCustomTest {
    public static void main(String[] args) {
        HashMapCustom<Object, Integer> map = new HashMapCustom<Object, Integer>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("Alice", 28); // Update value for "Alice"

        System.out.println("Value of Alice: " + map.get("Alice")); // 28
        System.out.println("Value of Bob: " + map.get("Bob"));       // 30
        System.out.println("Value of Charlie: " + map.get("Charlie"));// 35

        map.remove("Bob");
        System.out.println("Value of Bob after removal: " + map.get("Bob")); // null

        System.out.println("\nCustom HashMap Contents:");
        map.printMap();

        System.out.println("\nIterating over CustomHashMap entries:");
        for (HashMapCustom.Entry<Object, Integer> entry : map) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
