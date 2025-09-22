package Package3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(2, "Jackson");
        Student s2 = new Student(3, "Stark");
        Student s3 = new Student(33, "Donald");

        List<Student> li = new ArrayList<Student>();
        li.add(s1);
        li.add(s2);
        li.add(s3);

        // custom objects ko sort kar rahe hai haam.
        // We need to create our own Comparator.
        // We need to define how to sort custom objects or data it is not Integers that sort Natural order.
        Collections.sort(li, (a,b) -> b.id - a.id); // .id is custom for Objects.
        System.out.println(li);
    }

    static class Student {
        public Integer id;

        public String name;

        public Student(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString(){
            return this.id + ": "+ this.name;
        }
    }
}
