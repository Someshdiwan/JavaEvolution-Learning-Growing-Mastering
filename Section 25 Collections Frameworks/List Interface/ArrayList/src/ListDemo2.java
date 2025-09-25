import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        // Sort strings by length descending.
        List<String> words = Arrays.asList("banana", "apple", "date");

        // The original example used (a, b) -> b.length() - a.length()
        words.sort((a, b) -> b.length() - a.length());

        System.out.println("Words sorted by length (desc): " + words);


        // Sort integers in descending natural order
        List<Integer> ints = new ArrayList<>();
        ints.add(2);
        ints.add(1);
        ints.add(3);

        ints.sort((a, b) -> b - a);
        System.out.println("Integers sorted desc: " + ints);
    }
}
