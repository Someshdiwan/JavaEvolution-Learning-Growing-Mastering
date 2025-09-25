import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo3 {
    public static void main(String[] args) {
        // Example 1: Normal ArrayList
        List<String> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

        // Example 2: Arrays.asList with varargs
        List<String> list1 = Arrays.asList("Monday", "Tuesday");
        System.out.println(list1.getClass().getName());

        // You can modify elements (set), but cannot add/remove
        list1.set(1, "Wednesday");
        System.out.println(list1.get(1));

        // Example 3: Arrays.asList with existing array
        String[] array = {"Apple", "Banana", "Cherry"};
        List<String> list2 = Arrays.asList(array);
        System.out.println(list2.getClass().getName());

        List<Integer> list3 = List.of(1,2,3,4);
        list3.set(1,33);
    }
}

/*
1.	new ArrayList<>() → Returns a true ArrayList.
2.	Arrays.asList("Monday", "Tuesday") → Returns a fixed-size list backed by the array.
3.	Arrays.asList(array) → Also a fixed-size list backed by the provided array.
*/
