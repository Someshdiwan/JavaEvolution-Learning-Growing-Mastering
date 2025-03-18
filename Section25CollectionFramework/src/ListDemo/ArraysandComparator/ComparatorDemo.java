package ListDemo.ArraysandComparator;

import java.util.Arrays;

/**
 * This class demonstrates the usage of Arrays and the Comparator interface in Java.
 *
 * @see <a href="https://www.geeksforgeeks.org/comparator-interface-java/">Comparator Interface - GeeksforGeeks</a>
 */
public class ComparatorDemo {
    public static void main(String[] args)
    {
        int a[] = {2,4,6,8,1,3,5,11};
        int b[] = {2,4,6,8,1,3,5,7};
        /*
        Checking both array same or not.
        Try to remove one element from both array one by one. remove one or many as you wish.
        The method Arrays.compare(a, b) in Java compares two arrays lexicographically.
        This means it compares elements one by one from the beginning, and as soon as it finds a mismatch,
        it determines the order based on that difference.
        */
        System.out.println(Arrays.compare(a,b));

       //int c[] =  Arrays.copyOf(a,4);
       int c[] =  Arrays.copyOf(a,a.length);
       for(int x:c)
           System.out.println("Print all elements: "+x);

        // Convert primitive int[] to Integer[] for deepEquals
        Integer[] objA = Arrays.stream(a).boxed().toArray(Integer[]::new);
        Integer[] objC = Arrays.stream(c).boxed().toArray(Integer[]::new);

        System.out.println("Are arrays deeply equal? " + Arrays.deepEquals(objA, objC));

        /*Try others methods also.*/

        //Arrays.mismatch(, );
        //Arrays.sort();
        //Arrays.parallelPrefix();
    }
}