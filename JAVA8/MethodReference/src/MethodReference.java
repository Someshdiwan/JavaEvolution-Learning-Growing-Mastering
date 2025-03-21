import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {

        // Method reference --> use method without invoking & in place of lambda expression
        List<String> students = Arrays.asList("Ram", "Shyam", "Ghanshyam");

        //students.forEach(x -> System.out.println(x));
        students.forEach(System.out::println);
    }
}