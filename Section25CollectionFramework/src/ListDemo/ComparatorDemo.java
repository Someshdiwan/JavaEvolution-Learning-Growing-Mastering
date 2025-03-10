package ListDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
    private String name;

    private double gpa;

    public Student(String name, double gpa){
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

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> Students =  new ArrayList<>();

        Students.add(new Student("Alice",3.5));
        Students.add(new Student("Bob",3.1));
        Students.add(new Student("Charlie",3.9));
        Students.add(new Student("Akshit",3.4));
        Students.add(new Student("Smith",3.4));

        // Option 1: Default sort using natural ordering (if implemented in Student)
        //Students.sort(null);

        // Option 2: Custom sort using a lambda expression as a Comparator.
        // This comparator sorts the students primarily by descending GPA.
        // If two students have the same GPA, it sorts them alphabetically by name.

        Students.sort((o1,o2)->
        {
            // Calculate the difference in GPA (note: o2 - o1 gives descending order).
           if(o2.getGpa() - o1.getGpa() > 0)
           {
               // If o2 has a higher GPA, it should come before o1.
               return 1;
           }
           else if (o2.getGpa() - o1.getGpa() <0)
           {
               // If o1 has a higher GPA, it should come before o2.
               return -1;
           }
           else
           {
               // If GPAs are equal, sort by name in ascending (alphabetical) order.
               return o1.getName().compareTo(o2.getName());
               //Lexicographically compare kar raha hai...words ko dictionary order (alphabetical order)
               //mein compare kiya ja raha hai. Java mein, jab hum String ke compareTo() method ko call karte hain,
               //toh woh dono strings ke characters ko ek-ek karke compare karta hai
           }
        });

        for(Student s : Students)
        {
            System.out.println(s.getName()+": "+s.getGpa());
        }
    }
}