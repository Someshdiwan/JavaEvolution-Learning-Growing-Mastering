package ListDemo.ArrayListLinkedListStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

class StringLengthComparator implements Comparator<String> {

    public int compare(String o1, String o2) {
        //return 0;

        //return Integer.compare(o1.length(), o2.length());  // Compare based on length

        return o1.length() - o2.length();
      /*
      Logic:
      o1      o2
     "Ok"   "Bye"
      */
    }
}

class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
        /*
        5 and 3.
        3 and 5.
        */
    }
}
public class ListEDSort2 {
    public static void main(String[] args) {
        //check comparator in java it is very imp based on custom logics
        //if we want to sort a string above based on their length then comparator is useful.

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(7);
        list.add(1);

        list.sort(new MyComparator());  // Use MyComparator to sort integers
        System.out.println("Sorted integers: " + list);


        // Sorting a list of strings based on their length using StringLengthComparator
        List<String> words = Arrays.asList("banana", "apple", "date");

        words.sort(new StringLengthComparator());  // Use StringLengthComparator to sort by length
        System.out.println("Sorted strings by length: " + words);
    }
}