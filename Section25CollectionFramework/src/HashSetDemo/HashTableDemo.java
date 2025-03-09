package HashSetDemo;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo
{
    public static void main(String[] args)
    {
        //Older Version of JAVA. It is used

        Hashtable ht = new Hashtable();

/*
        Hashtable<Integer, String> ht1 = new Hashtable<Integer,String>();
*/

        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(4,"D");
        ht.put(5,"E");
        //String s=ht.get(3);
        //You have to type cast to a specific type. Downcast this

        String s = (String)ht.get(3);

        ht.compute(2, (k,v) -> v + "Z");

        ht.computeIfAbsent(7, (k)->"Z" + k);
    /*
    ht.computeIfAbsent(7, (k) -> "Z" + k);

    Checks if key 7 is present in Hashtable.
    If absent, it computes a new value using the lambda (k) -> "Z" + k.
    "Z" + 7 results in "Z7".
    Inserts {7="Z7"} into the hashtable.
    If key 7 already exists, it does nothing.
    This method is useful when you want to ensure a key has a value but only assign it if it was previously absent.
    */

        Enumeration e = ht.elements();

        Enumeration e1 = ht.keys();

        System.out.println("Hashtable Values:");
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }

        System.out.println("Hashtable Keys:");
        while (e1.hasMoreElements())
        {
            System.out.println(e1.nextElement());
        }
        //Not a Generic Class so there is not iterator is Available here.
        //later on it converted into Generic.

        /*
        ht.compute(2,(k,v)->v+"Z");

        The compute method in Hashtable is used to update the value associated with a given key. It takes:

        A key (K key) whose value needs to be recomputed.

        A BiFunction<K, V, V> that defines how the value should be updated.

        Before executing:

        ht.put(2, "B");
        The key 2 has the value "B".

        When compute(2, (k, v) -> v + "Z") runs:

        k = 2
        v = "B"

        The lambda function returns "B" + "Z", which is "BZ".

        The new value "BZ" replaces "B" in the hashtable.

        5. Key Takeaways: compute(K key, BiFunction<K, V, V> remappingFunction) modifies the existing value of a key based on its current value.

        The lambda (k, v) -> v + "Z" appends "Z" to the existing value.

        If the key does not exist, compute will return null or throw a NullPointerException if v is null and the lambda function tries to operate on it.

        This method is useful when updating values dynamically without needing to manually retrieve, modify, and put them back into the hashtable.
        */
    }
}