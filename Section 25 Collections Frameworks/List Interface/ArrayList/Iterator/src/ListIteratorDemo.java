import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* Demonstrates ListIterator, which supports bidirectional movement and
   methods like hasPrevious() / previous() in addition to next().
*/

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(5, 10, 50, 60, 70, 80, 90));

        ListIterator<Integer> it = list.listIterator();

        System.out.println("Forward traversal using ListIterator:");
        while (it.hasNext()) {
            Integer val = it.next();
            System.out.println("next(): " + val + "  | hasPrevious(): " + it.hasPrevious());
        }

        System.out.println("\nBackward traversal using ListIterator:");
        while (it.hasPrevious()) {
            System.out.println("previous(): " + it.previous());
        }
    }
}
