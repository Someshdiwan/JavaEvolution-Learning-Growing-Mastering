import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* Demonstrates using Iterator to traverse elements in a single direction. */

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(5, 10, 50, 60, 70, 80, 90));

        Iterator<Integer> it = list.iterator();
        System.out.println("Iterating with Iterator:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
