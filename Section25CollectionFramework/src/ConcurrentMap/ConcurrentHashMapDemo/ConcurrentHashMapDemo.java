package ConcurrentMap.ConcurrentHashMapDemo;

import ConcurrentMap.ConcurrentSkipListMapDemo.ConcurrentSkipListMapDemo;

import java.util.concurrent.ConcurrentHashMap;

/**
 * MAP --> SORTED --> THREAD SAFE --> ConcurrentSkipListMap
 *
 * @see ConcurrentSkipListMapDemo
 */

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map =  new ConcurrentHashMap<>();
        // Java 7 --> segment based locking --> 16 segments --> smaller hashmaps
        // Only the segment being written to or read from is locked
        // read: do not require locking unless there is a write operation happening on the same segment
        // write: lock

        // java 8 --> no segmentation
        //        --> Compare-And-Swap approach --> no locking except resizing or collision
        // Thread A last saw --> x = 45
        // Thread A work --> x to 50
        // if x is still 45, then change it to 50 else don't change and retry
        // put --> index

        map.put("World",2);
        map.put("Hello", 1);

        System.out.println(map);
    }
}