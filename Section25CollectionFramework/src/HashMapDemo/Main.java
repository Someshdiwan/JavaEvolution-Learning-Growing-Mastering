package HashMapDemo;

import java.util.*;

class Student implements Comparable<Student>
{
    private String name;
    private double gpa;

    public Student(String name, double gpa)
    {
        this.name = name;
        this.gpa  = gpa;
    }

    public String getName() { return name; }
    public double getGpa()  { return gpa; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(gpa, student.gpa) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gpa);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getGpa(), this.getGpa());
    }
}



public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Akshit", 3.9));

        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);


        students.sort((o1, o2) -> {
            if (o2.getGpa() - o1.getGpa() > 0) {
                return 1;
            } else if (o2.getGpa() - o1.getGpa() < 0) {
                return -1;
            } else {
                return o2.getName().compareTo(o1.getName());
            }
        });
        for (Student s : students) {
            System.out.println(s.getName() + ": " + s.getGpa());
        }
        Collections.sort(students, comparator);

/*        System.out.println(list.get(2));
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        for(int x: list){
            System.out.println(x);
        }
        System.out.println(list.contains(5));
        System.out.println(list.contains(50));

        list.remove(2);
        for(int x: list){
            System.out.println(x);
        }
        list.add(2, 50);

        for(int x: list){
            System.out.println(x);
        }

        list.add(1); // 0
        list.add(5); // 1
        list.add(80); // 2

        list.set(2, 50);

        System.out.println(list);


        ArrayList<Integer> list = new ArrayList<>(11);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity: " + elementData.length);

        list.add(1);


        elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity: " + elementData.length);

        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);

        elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity: " + elementData.length);

        list.trimToSize();

        elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity: " + elementData.length);


 List<String> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

        List<String> list1 = Arrays.asList("Monday", "Tuesday");
        System.out.println(list1.getClass().getName());
        list1.set(1, "Wednesday");
        System.out.println(list1.get(1));

        String[] array = {"Apple", "Banana", "Cherry"};
        List<String> list2 = Arrays.asList(array);
        System.out.println(list2.getClass().getName());

        List<String> list4 = new ArrayList<>(list2);
        list4.add("Mango");
        System.out.println(list4);


        List<Integer> list3 = List.of(1, 2, 3, 4);
        list3.set(1, 33);
        // removing first occurence

                List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(Integer.valueOf(1));
        System.out.println(list);

                Object[] array = list.toArray();
        Integer[] array1 = list.toArray(new Integer[0]);


        List<String> words = Arrays.asList("banana", "apple", "date");
        words.sort((a, b) -> b.length() - a.length());
        System.out.println(words);


        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

        list.sort((a, b) -> b - a);
        System.out.println(list);

                List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Akshit", 3.9));

        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);

        students.sort(comparator);
        for (Student s : students) {
            System.out.println(s.getName() + ": " + s.getGpa());
        }

        */

    }

}