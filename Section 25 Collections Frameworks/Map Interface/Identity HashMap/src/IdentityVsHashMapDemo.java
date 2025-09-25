import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityVsHashMapDemo {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> identityMap = new IdentityHashMap<>();
        HashMap<String, Integer> hashMap = new HashMap<>();

        // two distinct String instances with same textual content
        String key1 = new String("Akshit");
        String key2 = new String("Akshit");

        identityMap.put(key1, 90);
        identityMap.put(key2, 92);

        hashMap.put(key1, 90);
        hashMap.put(key2, 92);

        System.out.println("IdentityHashMap contents: " + identityMap);
        // IdentityHashMap keeps both entries because key1 != key2 (reference inequality)

        System.out.println("HashMap contents: " + hashMap);
        // HashMap overwrites the value for the equal key (equals() returns true)
    }
}
