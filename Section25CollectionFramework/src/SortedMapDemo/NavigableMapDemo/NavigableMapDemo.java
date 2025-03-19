package SortedMapDemo.NavigableMapDemo;
import java.util.*;

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();

        navigableMap.put(1,"One");
        navigableMap.put(5,"Five");
        navigableMap.put(2,"Natural Order Se Sort Hoke Arrange hote hai elements");
        navigableMap.put(3,"Three");

        System.out.println("Checking the Map items: "+navigableMap);

        System.out.println(navigableMap.lowerEntry(4));
        //Returns a key-value mapping associated with the greatest
        //key strictly less than the given key, or null if there is no such key.

        System.out.println(navigableMap.ceilingKey(4));
        //Returns the least key greater than or equal to the given key,
        //or null if there is no such key.

        System.out.println(navigableMap.higherEntry(3));
        System.out.println("Reversed Map: "+navigableMap.reversed());
    }
}