import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);

        // List to array.
        Object[] array = list.toArray();
        Integer[] array1 = list.toArray(new Integer[0]); // Zero Size Ki Array.
        System.out.println(array1);

        // Sort the list.
        Collections.sort(list);
        System.out.println(list);
    }
}
