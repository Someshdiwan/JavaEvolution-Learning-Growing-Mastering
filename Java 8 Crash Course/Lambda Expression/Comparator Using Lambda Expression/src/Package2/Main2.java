package Package2;

import java.util.Map;
import java.util.TreeMap;

public class Main2 {
    public static void main(String[] args) {
        // Natural ordering (ascending by key).
        Map<Integer, String> m = new TreeMap<>();
        m.put(22, "Z");
        m.put(1, "f");
        m.put(13, "y");
        System.out.println("Before Manual sorting (Natural Order): " + m);

        // Custom comparator (descending by key).
        Map<Integer, String> mm = new TreeMap<>((a, b) -> b - a);
        mm.put(22, "z");
        mm.put(1, "f");
        mm.put(13, "y");
        System.out.println("After Manual sorting (Descending Order): " + mm);
    }
}
