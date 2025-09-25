import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

// Comparator to compare Strings based on their length
class StringLengthComparator implements Comparator<String> {

    public int compare(String o1, String o2) {
        // return 0;
        // If you want to treat all strings as equal

        // return Integer.compare(o1.length(), o2.length());
        // Alternative way to compare by length

        return o1.length() - o2.length(); // Compare based on string length
        /*
           Example Logic:
           o1    o2
           "Ok"  "Bye"
           → "Ok".length() = 2
           → "Bye".length() = 3
           → 2 - 3 = -1  (so "Ok" comes before "Bye")
        */
    }
}

// Comparator to compare Integers in ascending order
class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2; // Positive if o1 > o2, Negative if o1 < o2
        /*
           Example:
           o1 = 5, o2 = 3 → 5 - 3 = 2  (5 comes after 3)
           o1 = 3, o2 = 5 → 3 - 5 = -2 (3 comes before 5)
        */
    }
}

public class ComparatorDemo2 {
    public static void main(String[] args) {
        // Comparator in Java is very important when sorting based on custom logic.

        // Example 1: Sorting integers using MyComparator
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(7);
        list.add(1);

        list.sort(new MyComparator());  // Use MyComparator to sort integers
        System.out.println("Sorted integers: " + list);

        // Example 2: Sorting strings based on their length using StringLengthComparator
        List<String> words = Arrays.asList("banana", "apple", "date");

        words.sort(new StringLengthComparator());  // Use StringLengthComparator to sort by length
        System.out.println("Sorted strings by length: " + words);
    }
}
