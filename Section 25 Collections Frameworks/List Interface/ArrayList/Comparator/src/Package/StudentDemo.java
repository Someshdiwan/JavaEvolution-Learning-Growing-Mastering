package Package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Demonstrates sorting a List<Student>.
 * Keeps your original manual comparator logic intact and then
 * shows sorting with a Comparator built via Comparator.comparing().
 */

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Akshit", 3.9));

        // Comparator constructed with Comparator helpers (keeps the same ordering intent)
        Comparator<Student> comparator = Comparator
                .comparing(Student::getGpa)
                .reversed()
                .thenComparing(Student::getName);

        // The original manual sort using lambda you provided (kept exactly)
        students.sort((o1, o2) -> {
            if (o2.getGpa() - o1.getGpa() > 0) {
                return 1;
            } else if (o2.getGpa() - o1.getGpa() < 0) {
                return -1;
            } else {
                return o2.getName().compareTo(o1.getName());
            }
        });

        // Print after the first sort
        System.out.println("After manual sort (original logic):");
        for (Student s : students) {
            System.out.println(s.getName() + ": " + s.getGpa());
        }

        // Now sort again using the Comparator (same intended order)
        Collections.sort(students, comparator);

        // Print after Collections.sort (comparator)
        System.out.println("\nAfter Collections.sort with comparator:");
        for (Student s : students) {
            System.out.println(s.getName() + ": " + s.getGpa());
        }
    }
}
