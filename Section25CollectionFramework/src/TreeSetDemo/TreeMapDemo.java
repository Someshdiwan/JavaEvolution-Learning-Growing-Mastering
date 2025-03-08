package TreeSetDemo;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.*;

/**
 * Demonstrates the usage of TreeMap.
 *
 * @see TreeSetDemo  // Links to another class in your project if it exists/
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html">TreeSet Documentation</a>
 */

//Map are used to store key + value.

public class TreeMapDemo {
    public static void main(String[] args)
    {
        TreeMap<Integer, String> TM = new TreeMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));

        TM.put(4, "E");
        TM.put(5, "F");
        TM.put(6, "G");

        Entry<Integer, String> e = TM.firstEntry();

        System.out.println(e.getKey()+" "+e.getValue());

        System.out.println("\n"+TM.ceilingEntry(5).getValue());

        System.out.println(TM.ceilingEntry(6).getValue());

        System.out.println(TM.containsKey(3));
        System.out.println(TM.get(4));

        System.out.println(TM);

    }
}

