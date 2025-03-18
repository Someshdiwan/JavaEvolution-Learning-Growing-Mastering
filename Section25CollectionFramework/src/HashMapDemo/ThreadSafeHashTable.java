package HashMapDemo;

import java.util.Hashtable;

/**
 * @see ThreadSafetyInHashMap
 *
 *  @author Somesh Diwan
 */

public class ThreadSafeHashTable  {
    public static void main(String[] args) {

        /*
        Concurrency in HashTable.
        It is thread safe.
        All methods are synchronized including get() method.In HashTable.
        */
        Hashtable<Integer, String> map = new Hashtable<>();

        Thread newThread1 = new Thread(() ->
        {
            for (int i = 0; i <= 1000; i++)
            {
                map.put(i, "New Thread1 Running");
            }
        });

        Thread thread2 = new Thread(() ->
        {
            for (int i = 1000; i < 2000; i++)
            {
                map.put(i, "Thread2");
            }
        });

        newThread1.start();
        thread2.start();

        try {
            newThread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final size of HashTable: " + map.size());
    }
}