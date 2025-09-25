import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        // Create a SortedSet using TreeSet implementation
        // Elements will be stored in ascending (natural) order
        SortedSet<Integer> numbers = new TreeSet<>();

        // Adding elements (order of insertion does not matter)
        numbers.add(30);
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);

        System.out.println("SortedSet: " + numbers);
        // Output: [10, 20, 30, 40, 50] (automatically sorted)

        // first() → returns the lowest element
        System.out.println("First element: " + numbers.first()); // 10

        // last() → returns the highest element
        System.out.println("Last element: " + numbers.last());   // 50

        // headSet(toElement) → all elements strictly less than a given element
        SortedSet<Integer> head = numbers.headSet(30);
        System.out.println("HeadSet (<30): " + head); // [10, 20]

        // tailSet(fromElement) → all elements greater than or equal to a given element
        SortedSet<Integer> tail = numbers.tailSet(30);
        System.out.println("TailSet (>=30): " + tail); // [30, 40, 50]

        // subSet(fromElement, toElement) → range [fromElement, toElement)
        SortedSet<Integer> sub = numbers.subSet(20, 50);
        System.out.println("SubSet(20, 50): " + sub); // [20, 30, 40]

        // contains() → check membership
        System.out.println("Does set contain 40? " + numbers.contains(40)); // true
        System.out.println("Does set contain 60? " + numbers.contains(60)); // false

        // Removing an element
        numbers.remove(30);
        System.out.println("After removing 30: " + numbers); // [10, 20, 40, 50]

        // Iteration (always in sorted order)
        System.out.print("Iterating SortedSet: ");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

/* SortedSet ensures uniqueness + automatic sorting.
It’s perfect for leaderboards, range queries, scheduling tasks, and ordered collections.

1.	Creation
•	SortedSet<Integer> numbers = new TreeSet<>();
•	Backed by a Red-Black Tree → elements kept in sorted ascending order.
2.	Adding Elements
•	Order of insertion doesn’t matter.
•	Output always sorted.
3.	Navigational Methods
•	first() → lowest element.
•	last() → highest element.
•	headSet(30) → all elements < 30.
•	tailSet(30) → all elements >= 30.
•	subSet(20, 50) → all elements from 20 (inclusive) to 50 (exclusive).
4.	Membership & Removal
•	contains(40) → check if element exists.
•	remove(30) → deletes the element, rebalances tree.
5.	Iteration
•	Always yields elements in sorted order.
*/
