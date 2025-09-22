import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
    public static void main(String[] args) {

        // Method reference --> use a method without invoking and in place of a lambda expression
        List<String> students = Arrays.asList("Ram", "Shyam", "Tony");

        //students.forEach(x -> System.out.println(x));
        students.forEach(System.out::println);
    }
}
