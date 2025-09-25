import java.util.*;
import java.util.LinkedHashSet;

/**
 * Demonstrates the usage of LinkedHashSet.
 *
 * @see LinkedHashSetDemo
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashSet.html">LinkedHashSet Documentation</a>
 */

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> LHS = new LinkedHashSet<>(10);

        HashSet<String> HS = new HashSet<>(10);

        LHS.add("A");
        LHS.add("C");
        LHS.add("E");
        LHS.add("K");
        LHS.add("B");
        LHS.add("G");
        LHS.add("B");


        HS.add("A");
        HS.add("C");
        HS.add("E");
        HS.add("K");
        HS.add("B");
        HS.add("G");
        HS.add("B");

        Iterator<String> itr = LHS.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("\n");

        Iterator<String> itr2 = HS.iterator();
        while(itr2.hasNext())
        {
            System.out.println(itr2.next());
        }

        /*
        LHS.forEach(System.out::println);
        System.out.println("\n");
        HS.forEach(System.out::println);
        */
    }
}

/*
LinkedHashSet vs HashSet:

difference between LinkedHashSet and HashSet in Java.
LinkedHashSet maintains insertion order, meaning elements are stored in the order they were added.
HashSet does not guarantee any order; elements are stored based on hash codes.

Key Points:
Insertion of elements into both LinkedHashSet and HashSet.
Duplicate values are ignored in both sets.
Iteration over elements using an Iterator to display stored values.
*/
