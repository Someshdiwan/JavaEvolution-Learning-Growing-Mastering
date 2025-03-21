package SortedMapDemo;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo1 {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();
        //In sorted map order is maintain low to high. Natural order of sorting

        //printing asscending to decending SortedMap<Integer, String> map = new TreeMap<>((a,b)->b-a);
        //SortedMap<Integer, String> map = new TreeMap<>((a,b)->b-a);

        map.put(91, "Vivek");
        map.put(99, "Shubham");
        map.put(78, "Mohit");
        map.put(77, "Vipul");
        System.out.println(map);

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap(91));
        System.out.println(map.tailMap(91));

        //map.subMap()

        //Sorting is done through based on Keys.
        System.out.println(map);

        System.out.println(map.get(77));
        System.out.println(map.containsKey(78));
        System.out.println(map.containsValue(77));
    }
}