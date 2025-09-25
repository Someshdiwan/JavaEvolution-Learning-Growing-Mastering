import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student2 {
    private String name;
    private double gpa;

    // Constructor to initialize a Student object with name and GPA
    public Student2(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }
}

public class Demo {
    public static void main(String[] args) {
        // Create a list of Student2 objects (changed generic type from Student to Student2)
        List<Student2> students = new ArrayList<>();

        // Adding Student2 objects to the list
        students.add(new Student2("Alice", 3.5));
        students.add(new Student2("Bob", 3.1));
        students.add(new Student2("Charlie", 3.9));
        students.add(new Student2("Akshit", 3.4));
        students.add(new Student2("Smith", 3.4));

        // Using Java 8's Comparator.comparing() method to create a comparator based on GPA.
        // The method reference Student2::getGpa tells the comparator to compare students by their GPA.
        Comparator<Student2> comparator = Comparator.comparing(Student2::getGpa);

        // Sorting the list using the custom comparator
        students.sort(comparator);
        //The students.sort(comparator) call sorts the list in ascending order based on GPA.

        // Printing the sorted list of students (by ascending GPA)
        System.out.println("Printing the sorted list of students (by ascending GPA)\n");
        for (Student2 student : students) {
            System.out.println(student.getName() + ": " + student.getGpa());
        }

        //reverse method add keya hai.
        Comparator<Student2> comparator2 = Comparator.comparing(Student2::getGpa).reversed();
        students.sort(comparator2);

        System.out.println("\nreverse method add keya hai.");
        for (Student2 student : students) {
            System.out.println(student.getName() + ": " + student.getGpa());
        }

        //This is using sort by their name.
        Comparator<Student2> comparator3 =
                Comparator.
                        comparing(Student2::getGpa).
                        reversed().
                        thenComparing(Student2::getName);

        System.out.println("\nTHis is using sort by their name.");
        for (Student2 student : students) {
            System.out.println(student.getName() + ": " + student.getGpa());
        }
    }
}
