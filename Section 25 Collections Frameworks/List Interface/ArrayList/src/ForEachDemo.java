import java.util.ArrayList;
import java.util.List;

/* Demonstrates forEach, method references, and a helper show() method. */

public class ForEachDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(5, 10, 50, 60, 70, 80, 90));

        System.out.println("forEach with lambda:");
        list.forEach(n -> System.out.println(n));

        System.out.println("\nforEach with method reference:");
        list.forEach(System.out::println);

        System.out.println("\nforEach with custom show() to filter (n > 60):");
        list.forEach(ForEachDemo::show);
    }
    private static void show(int n) {
        if (n > 60) {
            System.out.println(n);
        }
    }
}
