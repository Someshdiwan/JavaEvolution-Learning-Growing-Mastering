package HashMapDemo;

import java.util.*;
public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(17,0.5f);
        map.put(31, "Shubham");
        map.put(11, "Akshit");
        map.put(2, "Neha");
        map.put(2, "Mehul");
        System.out.println(map);

        boolean res = map.remove(31, "Nitin");
        System.out.println("REMOVED ? :" + res);
        System.out.println(map);

        List<Integer> list = Arrays.asList(2, 4, 32, 43, 4, 432);
        System.out.println(list.contains(32));
    }
}