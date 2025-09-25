import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpressionDemo  {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(1);

        list.sort((a,b) -> b-a);
        System.out.println(list);

        List<String> words = Arrays.asList("banana", "apple", "date");
        words.sort((a,b)->a.length()-b.length());
        System.out.println("Sorted strings by length: " + words);
    }
}
