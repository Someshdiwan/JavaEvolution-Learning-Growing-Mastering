import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(31,"Smith");
        map.put(11,"Shubham");
        map.put(2,"John");
        System.out.println(map);

        String student = map.get(3);
        System.out.println(student);

        map.get(6);
        System.out.println(map.containsKey(2));

        System.out.println(map.containsValue("John"));

        Set<Integer> keys =  map.keySet();
        for(int i: keys) {
            System.out.println(map);
        }
    }
}
