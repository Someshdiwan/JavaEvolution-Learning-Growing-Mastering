import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);

        //Collections.sort(list);

        //Another method using comparator.
        list.sort(null);
        System.out.println(list);

        List<String> words = Arrays.asList("banana","apple","date");
        words.sort(null);
        System.out.println(words);
    }
}
