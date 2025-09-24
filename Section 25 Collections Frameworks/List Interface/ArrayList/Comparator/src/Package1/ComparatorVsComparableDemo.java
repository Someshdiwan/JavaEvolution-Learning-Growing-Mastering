package Package1;

import java.util.*;

// Student implements Comparable → defines natural ordering
class Student implements Comparable<Student> {
    String name;
    double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    // Natural ordering → GPA descending, then name ascending
    @Override
    public int compareTo(Student other) {
        int gpaComparison = Double.compare(other.gpa, this.gpa);
        if (gpaComparison != 0) return gpaComparison;
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "{name='" + name + "', gpa=" + gpa + "}";
    }
}

public class ComparatorVsComparableDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Akshit", 3.9));

        // Using Comparable (natural ordering)
        Collections.sort(students);
        System.out.println("Sorted by Comparable (GPA desc, Name asc): " + students);

        // Using Comparator (custom ordering → Name only, ascending)
        students.sort(Comparator.comparing(s -> s.name));
        System.out.println("Sorted by Comparator (Name asc): " + students);

        // Another Comparator → GPA ascending, then Name descending
        students.sort(Comparator
                .comparingDouble((Student s) -> s.gpa)
                .thenComparing(Comparator.comparing((Student s) -> s.name).reversed()));
        System.out.println("Sorted by Comparator (GPA asc, Name desc): " + students);
    }
}

/*
1. Comparable:
   - Defined inside the class using compareTo().
   - Provides "natural ordering" of objects.
   - Only ONE natural order can exist per class.
   - Example here: GPA descending, then Name ascending.

2. Comparator:
   - External object or lambda passed when sorting.
   - Allows multiple different sorting logics without changing the class.
   - Can be chained (thenComparing).
   - Example here:
       a) By Name ascending
       b) By GPA ascending, then Name descending

3. Key Differences:

| Aspect           | Comparable                         | Comparator                          |
|------------------|------------------------------------|-------------------------------------|
| Package          | java.lang                          | java.util                           |
| Method           | compareTo(Object o)                | compare(Object o1, Object o2)       |
| Location         | Inside the class itself            | Separate class / lambda / method ref|
| Ordering Count   | One natural order per class        | Multiple custom orders possible     |
| Usage            | Collections.sort(list)             | list.sort(Comparator) / TreeSet(c)  |

4. When to Use:
- Comparable → If there is a single, natural way to compare objects (e.g., GPA for students, ID for employees).
- Comparator → If you need flexible or multiple ways to sort (by GPA, by name, by age, etc.).
*/
