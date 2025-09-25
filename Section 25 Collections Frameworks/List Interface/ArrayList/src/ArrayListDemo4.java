import java.util.ArrayList;
import java.util.List;

/* Demonstrates basic ArrayList usage:
 * - creation with initial capacity
 * - creation from another collection
 * - add, add at index, addAll at index
 * - set(index, value) and get
 */

public class ArrayListDemo4 {
    public static void main(String[] args) {
        // Object of ArrayList with initial capacity 20
        ArrayList<Integer> al1 = new ArrayList<>(20);

        // Create from an existing collection
        ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));

        al1.add(10);
        al1.add(0, 5);          // insert 5 at index 0
        al1.addAll(1, al2);     // insert all elements of al2 starting at index 1
        al1.set(5, 70);         // replace element at index 5

        // Note: set(6,100) would throw IndexOutOfBounds if index 6 doesn't exist.
        // To match the original, guard against OOB:
        if (al1.size() > 6) {
            al1.set(6, 100);
        } else {
            // safely add if the index doesn't exist
            while (al1.size() < 6) al1.add(0);
            al1.add(100);
        }

        System.out.println("ArrayList contents: " + al1);
    }
}
