package HashMapDemo.EnumMapDemo;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        // array of size same as enum
        // [_,"Gym",_,_,_,_,_]
        // no hashing no hash function to convert and store no Buckets
        // ordinal/index is used
        // FASTER THAN HASHMAP
        // MEMORY EFFICIENT

        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.TUESDAY, "Gym");
        map.put(Day.MONDAY, "Walk");
        map.put(Day.SUNDAY, "Sleep Relax");

        String s = map.get(Day.TUESDAY);
        System.out.println(s);

        System.out.println(map);
    }
}

enum Day
{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}