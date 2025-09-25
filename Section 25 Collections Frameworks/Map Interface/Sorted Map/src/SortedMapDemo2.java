import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo2 {
    public static void main(String[] args) {
        // TreeMap with custom Comparator (descending order by keys)
        SortedMap<Integer, String> map = new TreeMap<>((a, b) -> b - a);

        map.put(91, "Vivek");
        map.put(99, "Shubham");
        map.put(78, "Mohit");
        map.put(77, "Vipul");

        // Print map -> keys will appear in descending order now
        System.out.println(map);

        // First (now largest, since descending order)
        System.out.println("First Key (highest): " + map.firstKey());

        // Last (now smallest, since descending order)
        System.out.println("Last Key (lowest): " + map.lastKey());

        // headMap(91) -> in descending, gives keys greater than 91
        System.out.println("headMap(91): " + map.headMap(91));

        // tailMap(91) -> in descending, gives keys <= 91
        System.out.println("tailMap(91): " + map.tailMap(91));

        // Get by key
        System.out.println("Value for key 77: " + map.get(77));

        // Key existence
        System.out.println("Contains key 78? " + map.containsKey(78));

        // Value existence
        System.out.println("Contains value 77? " + map.containsValue(77));
    }
}
