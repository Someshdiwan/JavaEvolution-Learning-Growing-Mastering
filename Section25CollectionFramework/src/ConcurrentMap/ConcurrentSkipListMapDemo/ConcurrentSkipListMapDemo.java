package ConcurrentMap.ConcurrentSkipListMapDemo;

// MAP --> SORTED --> THREAD SAFE --> ConcurrentSkipListMap

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo
{
    public static void main(String[] args)
    {
            //Supported to multi-threading and Concurrency.
            ConcurrentSkipListMap<String,Integer> map = new ConcurrentSkipListMap<>();
            map.put("Apple", 2);
            map.put("Banana", 4);
            map.put("Mango", 3);

            System.out.println(map);
    }
}
/* A scalable concurrent ConcurrentNavigableMap implementation.
The map is sorted according to the natural ordering of its keys, or
by a Comparator provided at map creation time, depending on which constructor is used.
This class implements a concurrent variant of SkipLists  providing expected average log(n) time cost for the containsKey,
get, put and remove operations and their variants. Insertion, removal, update, and access operations safely execute
concurrently by multiple threads. */