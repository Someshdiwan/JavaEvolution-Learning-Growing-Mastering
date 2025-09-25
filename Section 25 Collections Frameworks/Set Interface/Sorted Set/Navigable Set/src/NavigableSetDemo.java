import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) {

        // NavigableSet is a subinterface of SortedSet
        // It provides navigation methods (lower, floor, ceiling, higher, pollFirst, pollLast, etc.)
        // TreeSet is the most commonly used implementation.

        NavigableSet<Integer> numbers = new TreeSet<>();

        // Adding elements (TreeSet stores them in natural sorted order by default)
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original Set: " + numbers);
        // Output: [10, 20, 30, 40, 50]

        // lower(E e): greatest element strictly less than e
        System.out.println("Lower(30): " + numbers.lower(30));
        // Output: 20

        // floor(E e): greatest element less than or equal to e
        System.out.println("Floor(30): " + numbers.floor(30));
        // Output: 30

        // ceiling(E e): least element greater than or equal to e
        System.out.println("Ceiling(25): " + numbers.ceiling(25));
        // Output: 30

        // higher(E e): least element strictly greater than e
        System.out.println("Higher(30): " + numbers.higher(30));
        // Output: 40

        // pollFirst(): retrieves and removes the first element
        System.out.println("PollFirst: " + numbers.pollFirst());
        // Output: 10
        System.out.println("After pollFirst: " + numbers);
        // Output: [20, 30, 40, 50]

        // pollLast(): retrieves and removes the last element
        System.out.println("PollLast: " + numbers.pollLast());
        // Output: 50
        System.out.println("After pollLast: " + numbers);
        // Output: [20, 30, 40]

        // descendingSet(): returns a reverse order view of the set
        NavigableSet<Integer> descending = numbers.descendingSet();
        System.out.println("Descending Set: " + descending);
        // Output: [40, 30, 20]
    }
}
