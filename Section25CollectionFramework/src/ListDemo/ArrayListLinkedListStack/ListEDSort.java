package ListDemo.ArrayListLinkedListStack;

import java.util.*;

public class ListEDSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);

        //Collections.sort(list);

        //Other method using comparator
        list.sort(null);
        System.out.println(list);

        List<String> words = Arrays.asList("banana","apple","date");
        words.sort(null);
        System.out.println(words);
    }
}