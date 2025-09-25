import java.util.HashMap;
import java.util.Map;

public class IdentityHashMapDemo2 {
    public static void main(String[] args) {
        // Two different String objects but with the same content "key"
        String key1 = new String("key");
        String key2 = new String("key");

        // Normal HashMap → uses equals() and hashCode()
        Map<String, Integer> map = new HashMap<>();

        map.put(key1, 1);  // First insert
        map.put(key2, 2);  // Will overwrite because key1.equals(key2) == true

        System.out.println("HashMap Result: " + map);

        System.out.println(key1.equals(key2));
    }
}

//  Using HashMap (uses .equals() for key comparison).
