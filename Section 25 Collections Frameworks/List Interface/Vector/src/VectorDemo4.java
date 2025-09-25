import java.util.Vector;

public class VectorDemo4 {
    public static void main(String[] args) {
        // Create a Vector of Integers
        Vector<Integer> vector = new Vector<>();

        // Adding elements
        vector.add(10);
        vector.add(20);
        vector.add(30);

        // Access elements by index
        System.out.println("First element: " + vector.get(0));

        // Iterating using for-each
        System.out.println("Iterating over Vector:");
        for (Integer val : vector) {
            System.out.println(val);
        }

        // Removing an element
        vector.remove(1); // removes element at index 1 (20)
        System.out.println("After removal: " + vector);
    }
}

/*
1. Overview
   - Vector is part of java.util (legacy class, introduced in Java 1.0).
   - Implements List, RandomAccess, Cloneable, Serializable.
   - Internally backed by a **dynamic array** (similar to ArrayList).
   - All methods are **synchronized** → thread-safe but slower than ArrayList.

2. Internal Structure
   - Uses an Object[] array internally to store elements.
   - Fields (simplified):
       Object[] elementData;  // stores elements
       int elementCount;      // current number of elements
       int capacityIncrement; // how much to grow when resizing (default: double capacity)

3. Resizing Mechanism
   - When adding elements and array is full:
     - If capacityIncrement > 0 → capacity increases by that fixed value.
     - Else (default) → capacity doubles.
   - Example:
     Initial capacity = 10
     Add 11th element → capacity grows to 20

4. Key Operations (Time Complexity)
   - add(E e) → Amortized O(1)
   - get(int index) → O(1)
   - set(int index, E e) → O(1)
   - remove(int index) → O(n) (elements shift)
   - iteration → O(n)

5. Characteristics
   - Allows **duplicates**.
   - Maintains **insertion order**.
   - Allows **null elements**.
   - Legacy support: Enumeration (in addition to Iterator & ListIterator).

6. Best Use Cases
   - Rarely recommended for new code.
   - Useful in old codebases where thread-safe List is required.
   - Alternative: Use ArrayList + Collections.synchronizedList() 
     or CopyOnWriteArrayList in modern applications.
*/
