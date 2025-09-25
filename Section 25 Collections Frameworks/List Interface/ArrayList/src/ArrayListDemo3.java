import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //list.remove(1);

        //Very Important.
        list.remove(Integer.valueOf(1));
        System.out.println(list);

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Banana");
        fruits.add("Date");

        fruits.remove(fruits.remove(1));
        System.out.println(fruits);
    }
}
