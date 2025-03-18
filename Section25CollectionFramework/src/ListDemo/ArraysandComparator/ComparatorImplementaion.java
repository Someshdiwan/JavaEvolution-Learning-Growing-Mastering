package ListDemo.ArraysandComparator;
import java.util.*;

/**
 * This class demonstrates the usage of Arrays and the Comparator interface in Java.
 *
 * @see <a href="https://www.geeksforgeeks.org/comparator-interface-java/">Comparator Interface - GeeksforGeeks</a>
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html">Comparator Interface - Java Documentation</a>
 */

class My implements Comparator<Integer>
{
    //Implementing compare method inside the comparator interface by reversing the order.
    public int compare(Integer i1,Integer i2)
    {
        if(i1<i2)
            return 1;
        if(i1>i2)
            return -1;
        return 0;
    }
}
public class ComparatorImplementaion {
    public static void main(String[] args) {
        Integer a[] = {2, 4, 6, 8, 1, 3, 5, 7};
        //Passing comparator and name of comparator class.

        Arrays.sort(a, new My());

        //Arrays.sort(a.new My());
        //you can use without My() then comparable interface will be used.

        for (Integer x : a)
            System.out.print(" " + x);
    }
}