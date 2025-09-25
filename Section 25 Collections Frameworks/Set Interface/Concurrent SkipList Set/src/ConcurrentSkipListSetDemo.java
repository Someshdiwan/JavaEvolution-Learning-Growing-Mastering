import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetDemo {
    public static void main(String[] args) {
        // Create a ConcurrentSkipListSet of Integers
        // Maintains elements in sorted order
        // Thread-safe: supports concurrent access
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();

        // Adding elements (in arbitrary order)
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(40);

        // Duplicate elements are ignored (Set property)
        set.add(20);

        // Prints elements in ascending order (natural ordering)
        System.out.println("Elements in set: " + set);
        // Output: [10, 20, 30, 40, 50]

        // First element (lowest)
        System.out.println("First element: " + set.first()); // 10

        // Last element (highest)
        System.out.println("Last element: " + set.last());   // 50

        // headSet() returns elements strictly less than given value
        System.out.println("HeadSet (<30): " + set.headSet(30)); // [10, 20]

        // tailSet() returns elements greater than or equal to given value
        System.out.println("TailSet (>=30): " + set.tailSet(30)); // [30, 40, 50]

        // subset() returns elements between given range
        System.out.println("SubSet(20, 40): " + set.subSet(20, 40)); // [20, 30]

        // Concurrent nature: multiple threads can safely modify
        // Here we simulate two threads adding values concurrently
        Thread t1 = new Thread(() -> {
            for (int i = 60; i <= 70; i += 2) {
                set.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 61; i <= 71; i += 2) {
                set.add(i);
            }
        });

        t1.start();
        t2.start();

        // Join threads to wait until completion
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // The set remains sorted and thread-safe even after concurrent modifications
        System.out.println("After concurrent insertions: " + set);
    }
}
