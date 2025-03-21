package SortedMapDemo.TreeMapDemo;

import java.util.ArrayList;
import java.util.List;


class Student implements Comparable<Student> {

    private String name;
    private double gpa;
   /* These are instance variables of the Student class. They store the student's name and GPA. */

    // Constructor to initialize the Student object with name and GPA.
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    // This interface imposes a total ordering on the objects of each class that implements it.
    // This ordering is referred to as the class's natural ordering, and the class's compareTo method is
    // referred to as its natural comparison method.
    // Override the compareTo method to define natural ordering of Student objects.
    // Students are compared based on GPA (ascending order).
    // If GPAs are equal, then the names are compared lexicographically.
   /* @Override
    public int compareTo(Student other) {
        int gpaComparison = Double.compare(this.gpa, other.gpa);
        if (gpaComparison != 0)
        {
            return gpaComparison;
        }
        return this.name.compareTo(other.name);
    }*/

    @Override
    public int compareTo(Student other) {
        // For descending order, compare other.gpa with this.gpa.
        int gpaComparison = Double.compare(other.gpa, this.gpa);
        if (gpaComparison != 0) {
            return gpaComparison;
        }
        // If GPAs are equal, use name comparison in natural (ascending) order.
        return this.name.compareTo(other.name);
    }


    // Override toString method to provide a readable representation of the Student object.
    @Override
    public String toString()
    {
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

        // Sort the list using the natural ordering defined by compareTo method.
        list.sort(null);
        System.out.println(list);

        // Create a list of integers.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(99);
        numbers.sort(null);
        System.out.println(numbers);

        //Comparator use when we want to write a custom logic.
        //null means natural ordering class ko bata ke hoti hai.
        //Implement karke....Implements Comparable<> interface.
    }
}