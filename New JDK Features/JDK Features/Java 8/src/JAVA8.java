import java.util.*;
import java.util.stream.Collectors;

interface Greetable {
    // Default method in interface
    default void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

public class JAVA8 implements Greetable {
    public static void main(String[] args) {
        // Lambda Expression Example
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        System.out.println("Using Lambda to print names:");
        names.forEach(name -> System.out.println(name));

        // Stream API Example
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sumOfEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("\nSum of even numbers: " + sumOfEven);

        List<String> filteredNames = names.stream()
                .filter(n -> n.startsWith("C"))
                .collect(Collectors.toList());

        System.out.println("Names starting with 'C': " + filteredNames);

        // Default Method Example
        JAVA8 demo = new JAVA8();
        demo.greet("Developer");
    }
}