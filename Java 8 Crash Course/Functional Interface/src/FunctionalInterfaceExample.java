import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // 1. Function<T, R>
        // Takes an input of type T, returns an output of type R
        // Example: Convert String -> Integer (length of string)

        Function<String, Integer> stringLength = str -> str.length();
        System.out.println("Function Example: Length of 'Java8' = " + stringLength.apply("Java8"));

        // 2. Predicate<T>
        // Takes an input of type T, returns boolean
        // Example: Check if a number is even
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Predicate Example: Is 10 even? " + isEven.test(10));
        System.out.println("Predicate Example: Is 7 even? " + isEven.test(7));

        // 3. Consumer<T>
        // Takes an input of type T, returns nothing (just consumes it)
        // Example: Print a message to console
        Consumer<String> printMessage = msg -> System.out.println("Consumer Example: " + msg);
        printMessage.accept("Hello from Consumer!");

        // 4. Supplier<T>
        // Takes no input, only supplies a value of type T
        // Example: Supply a random number
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Supplier Example: Random number = " + randomSupplier.get());

        /*
        Quick Recap (Why Functional Interfaces are powerful)
         - Function   → Transform data
         - Predicate  → Filter data (boolean logic)
         - Consumer   → Perform action (like printing, logging)
         - Supplier   → Provide data (like random numbers, IDs, timestamps)

         •	Function = input → output
	     •	Predicate = test condition → boolean
	     •	Consumer = just use input, no return
	     •	Supplier = only return, no input
        */
    }
}
