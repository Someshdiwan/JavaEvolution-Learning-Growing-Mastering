package Package2;

import java.util.TreeSet;

// A simple Point class representing a 2D coordinate.
// Implements Comparable so that Point objects can be sorted in a TreeSet.
class Point implements Comparable {
    int x;
    int y;

    // Constructor to initialize a Point with x and y coordinates.
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Provide a human-readable string representation of the Point.
    @Override
    public String toString() {
        return "X=" + x + " Y=" + y;
    }

    /* compareTo() defines the "natural ordering" for Point objects.
     * - First compare by x-coordinate.
     * - If x is equal, then compare by y-coordinate.
     * - Returns:
     *   - negative if this < other,
     *   - positive if this > other,
     *   - 0 if both coordinates are equal.
     */

    @Override
    public int compareTo(Object o) {
        Point p = (Point) o;

        if (this.x < p.x)
            return -1;
        else if (this.x > p.x)
            return 1;
        else {
            if (this.y < p.y)
                return -1;
            else if (this.y > p.y)
                return 1;
            else
                return 0;
        }
    }
}

public class ComparableInterfaceDemoIMP {
    public static void main(String[] args) {
        /* In this program, we are storing objects of our own class (Point) inside a TreeSet.
         * TreeSet:
         * - A TreeSet is a sorted set (implements NavigableSet).
         * - It requires elements to be comparable in order to maintain sorted order.

         * Therefore:
         * - Our Point class implements Comparable so that TreeSet can compare Point objects.
         * - The compareTo() method defines how two Point objects are compared.
         */

        TreeSet<Point> TS = new TreeSet<>();

        // Objects are compared using the compareTo() method defined in Point.
        TS.add(new Point(1, 1));
        TS.add(new Point(5, 5));
        TS.add(new Point(5, 2)); // Will be placed before (5,5) since y=2 < y=5

        // Printing TreeSet will show sorted order of Points (by x, then by y).
        System.out.println(TS);
    }
}

/* Summary:
- This program demonstrates how to store objects of a user-defined class (Point) inside a TreeSet.
- Since TreeSet is a sorted collection, objects must be comparable.
- By implementing Comparable and overriding compareTo(), we define the natural ordering of Point objects.

1. Why Comparable?
   - TreeSet is a sorted set (backed by a Red-Black Tree).
   - It requires a way to compare objects to maintain order.
   - For user-defined classes, we must provide comparison logic.
   - Implementing Comparable and overriding compareTo() achieves this.

2. Ordering Logic in compareTo():
   - First compares by x-coordinate.
   - If x values are equal, then compare by y-coordinate.
   - Returns:
       - Negative → this < other
       - Positive → this > other
       - 0 → both points are equal

3. Output Example:
   Input points: (1,1), (5,5), (5,2)
   Sorted order: [(1,1), (5,2), (5,5)]

4. Key Notes:
   - TreeSet automatically sorts using compareTo().
   - Duplicate elements (same x and y) are not stored.
   - Comparable → natural ordering inside the class.
   - Comparator (alternative) → external custom ordering.
*/
