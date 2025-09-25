import java.util.HashMap;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<Integer, String> HM = new HashMap<>();

        HM.put(1, "Hello");
        HM.put(2, "World");
        HM.put(3, "This is the Hash Map");
        HM.put(4, "Adding elements");
        HM.put(5, "Done");

        System.out.println(HM);
    }
}
