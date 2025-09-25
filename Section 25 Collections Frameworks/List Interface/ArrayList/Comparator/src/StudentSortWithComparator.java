import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* Demonstrates a comparator that sorts by GPA descending then by name. */

public class StudentSortWithComparator {
    static class Student {
        private final String name;
        private final double gpa;
        public Student(String name, double gpa) {
            this.name = name; this.gpa = gpa;
        }
        public String getName() { return name; }
        public double getGpa() { return gpa; }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Akshit", 3.9));

        Comparator<Student> comparator = Comparator
                .comparing(Student::getGpa)
                .reversed()
                .thenComparing(Student::getName);

        students.sort(comparator);

        for (Student s : students) {
            System.out.println(s.getName() + ": " + s.getGpa());
        }
    }
}
