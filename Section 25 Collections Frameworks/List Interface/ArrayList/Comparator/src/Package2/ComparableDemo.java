package Package2;

import java.util.ArrayList;
import java.util.List;

// Student class implements Comparable to define natural ordering of Student objects.
class Student implements Comparable<Student> {

    // Instance variables: hold the student's name and GPA.
    private String name;
    private double gpa;

    // Constructor: initializes Student with a name and GPA.
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    /* The Comparable interface imposes a total ordering on the objects of the class.
     * - compareTo() defines the "natural ordering" of objects.
     * - Collections like List or TreeMap can use this ordering for sorting automatically.

     * In this implementation:
     * - Students are compared primarily by GPA.
     * - Order is descending by GPA (higher GPA comes first).
     * - If GPAs are equal, comparison falls back to the student's name (ascending lexicographical order).
     */

    @Override
    public int compareTo(Student other) {
        // Compare by GPA (descending).
        int gpaComparison = Double.compare(other.gpa, this.gpa);
        if (gpaComparison != 0) {
            return gpaComparison;
        }
        // If GPA is the same, compare by name (ascending).
        return this.name.compareTo(other.name);
    }

    // Override toString to provide a human-readable representation of the Student object.
    @Override
    public String toString() {
        return "Student{name='" + name + "', gpa=" + gpa + "}";
    }
}

public class ComparableDemo {
    public static void main(String[] args) {

        // Create a list of Student objects.
        List<Student> list = new ArrayList<>();
        list.add(new Student("Charlie", 3.5));
        list.add(new Student("Bob", 3.7));
        list.add(new Student("Alice", 3.5));
        list.add(new Student("Akshit", 3.9));

        // Sort the list using natural ordering (defined in compareTo).
        // Passing `null` to sort() means "use the natural ordering."
        list.sort(null);
        System.out.println(list);

        // Create a list of integers.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(99);

        // Sort integers in their natural ordering (ascending).
        numbers.sort(null);
        System.out.println(numbers);

        /* NOTE:
         * - Comparable: Used when a class defines its own "natural order" by implementing compareTo().
         * - Comparator: Used for custom sorting logic, external to the class.
         * - In this example, Student implements Comparable, so we can sort Students naturally by GPA + name.
         */
    }
}
