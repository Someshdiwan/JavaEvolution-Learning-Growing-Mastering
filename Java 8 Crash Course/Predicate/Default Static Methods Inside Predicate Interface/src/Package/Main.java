package Package;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> startsWithLetterV = x -> x.toLowerCase().charAt(0) == 'v';

        Predicate<String> endsWithLetterL = x -> x.toLowerCase().charAt(x.length() - 1) == 'l';

        Student s1 = new Student("Jack", 1);
        Student s2 = new Student("Jackson", 2);

        Predicate<Student> studentPredicate = x -> x.getId() > 1;
        System.out.println(studentPredicate.test(s2));
    }

    private static class Student {
        String name;
        int id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }
    }
}
