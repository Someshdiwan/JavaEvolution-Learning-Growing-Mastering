import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        // Create a CopyOnWriteArraySet
        // Backed by CopyOnWriteArrayList (thread-safe, no duplicates)
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Duplicate element (ignored silently)
        set.add("Apple");

        System.out.println("Initial Set: " + set);
        // Output: [Apple, Banana, Orange]

        // Iteration is safe: snapshot semantics
        System.out.println("Iterating over set:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Demonstrate safe concurrent modification
        System.out.println("\nIterating while modifying:");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String fruit = it.next();
            System.out.println("Visiting: " + fruit);

            // Try modifying during iteration
            // Unlike HashSet, this will NOT throw ConcurrentModificationException
            if (fruit.equals("Banana")) {
                set.add("Grapes");  // modification creates a new copy internally
            }
        }

        System.out.println("Set after modification during iteration: " + set);
        // Output includes Grapes, iteration snapshot remains consistent

        // Removing an element
        set.remove("Apple");
        System.out.println("After removing Apple: " + set);

        // Checking membership
        System.out.println("Contains Orange? " + set.contains("Orange"));
        System.out.println("Contains Apple? " + set.contains("Apple"));

        // Demonstrating thread-safe behavior with multiple threads
        Thread t1 = new Thread(() -> {
            set.add("Mango");
            set.add("Pineapple");
        });

        Thread t2 = new Thread(() -> {
            set.add("Kiwi");
            set.remove("Orange");
        });

        t1.start();
        t2.start();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final state of set (thread-safe modifications)
        System.out.println("Final Set after concurrent modifications: " + set);
    }
}

/* CopyOnWriteArraySet is best when you need safe iteration and thread-safety with many readers but few writers
(e.g., event listeners, subscription sets, configuration flags).

1.	Creation
CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
•	Creates a thread-safe set with no duplicates, backed by CopyOnWriteArrayList.

2.	Adding Elements
•	Duplicates are ignored (Set property).

3.	Iteration
•	Iterators use snapshot semantics.
•	Modifications during iteration (like adding "Grapes") do not throw ConcurrentModificationException.
•	New elements may not be visible during that iteration but will be in subsequent iterations.

4.	Concurrent Modifications (Threads)
•	Two threads (t1, t2) add/remove elements concurrently.
•	Set remains thread-safe and consistent.

5.	Performance Note
•	Every modification (add, remove) creates a new copy of the internal array.
•	Expensive for frequent writes but very efficient for read-heavy use cases.
*/
