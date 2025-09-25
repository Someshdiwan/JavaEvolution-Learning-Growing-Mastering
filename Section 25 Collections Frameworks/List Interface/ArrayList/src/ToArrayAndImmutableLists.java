import java.util.*;

public class ToArrayAndImmutableLists {
    public static void main(String[] args) {
        // toArray examples
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Remove by object (first occurrence)
        list.remove(Integer.valueOf(1));
        System.out.println("After removing Integer.valueOf(1): " + list);

        // toArray() returns Object[]
        Object[] objectArray = list.toArray();
        System.out.println("Object[] length: " + objectArray.length);

        // toArray(T[]) returns typed array
        Integer[] integerArray = list.toArray(new Integer[0]);
        System.out.println("Integer[] length: " + integerArray.length);

        // Arrays.asList returns a fixed-size list (backed by array)
        List<String> list1 = Arrays.asList("Monday", "Tuesday");
        System.out.println("Arrays.asList class: " + list1.getClass().getName());
        list1.set(1, "Wednesday"); // allowed (changes backing array)
        System.out.println("After set on Arrays.asList: " + list1.get(1));

        // List.of returns an immutable list (attempting to modify throws UnsupportedOperationException)
        List<Integer> list3 = List.of(1, 2, 3, 4);
        System.out.println("List.of created an immutable list: class=" + list3.getClass().getName());
        try {
            list3.set(1, 33); // will throw
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify List.of(): " + e);
        }

        // Convert array to mutable ArrayList
        String[] array = { "Apple", "Banana", "Cherry" };
        List<String> list2 = Arrays.asList(array);
        List<String> list4 = new ArrayList<>(list2);
        list4.add("Mango");
        System.out.println("Mutable copy of Arrays.asList: " + list4);
    }
}
