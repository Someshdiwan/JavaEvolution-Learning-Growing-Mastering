import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        // Method 1: Convert List to an Object array.
        // The toArray() method without arguments returns an Object[] because it does not know the specific type.
        Object[] objectArray = list.toArray();

        System.out.println("Object array:");

        for (Object obj : objectArray) {
            System.out.println(obj);
        }

        // Method 2: Convert List to a typed Integer array.
        // By passing an array of the desired type (new Integer[0]), the method returns an array of type Integer[].
        Integer[] integerArray = list.toArray(new Integer[0]);

        System.out.println("\nInteger array:");

        for (Integer num : integerArray) {
            System.out.println(num);
        }
    }
}
