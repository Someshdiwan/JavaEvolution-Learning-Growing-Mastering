import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorForEachLoop {
    public static void main(String[] args) {
        // Create an ArrayList of Integers
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // 1. Using For-Each Loop
        for (int i : list) {
            System.out.println("For-each element: " + i);
        }

        // 2. Using Iterator (Forward Traversal)
        System.out.println("Using Iterator:");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 3. Removing Elements Using Iterator
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        /*
         * NOTE: Removing elements directly inside a for-each loop
         * causes ConcurrentModificationException.
         * Example (invalid):
         *
         * for (Integer number : numbers) {
         *     if (number % 2 == 0) {
         *         numbers.remove(number); //  Not allowed
         *     }
         * }

         * Correct way: use Iterator.remove()
         */
        System.out.println("Using Iterator to Remove Even Numbers:");
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
            Integer number = itr.next();
            if (number % 2 == 0) {
                itr.remove(); // Safe removal
            }
        }
        System.out.println("After removing evens: " + numbers); // [1, 3, 5]


        // 4. Using ListIterator (Bidirectional Traversal)

        /* ListIterator provides:
         * - Forward iteration (hasNext, next)
         * - Backward iteration (hasPrevious, previous)
         * - Ability to modify elements (set, add, remove)
         */
        System.out.println("Using ListIterator:");

        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()) {
            Integer val = listIterator.next();
            System.out.println(val);

            // Example: You could update elements here
            // listIterator.set(val * 10);
        }
    }
}

/*
1. For-Each Loop
   - Simplest way to iterate a collection.
   - Read-only iteration (cannot safely remove elements).

2. Iterator
   - Provides forward-only traversal of a collection.
   - Methods:
       hasNext() → check if more elements exist.
       next() → fetch next element.
       remove() → safely remove the last returned element.
   - Important: Use remove() of Iterator, not List.remove(), to avoid ConcurrentModificationException.

3. ListIterator
   - An enhanced iterator for Lists.
   - Provides bidirectional traversal:
       hasPrevious(), previous().
   - Supports modification:
       set(newValue), add(newElement), remove().
   - More powerful than a simple Iterator.

4. Practical Notes
   - Use for-each for simple reading.
   - Use Iterator when you may need to remove while traversing.
   - Use ListIterator when you need bidirectional traversal or in-place updates.
*/
