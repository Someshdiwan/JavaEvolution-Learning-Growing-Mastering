import java.util.Optional; // Import the Optional class

public class OptionalExample {
    public static void main(String[] args) {
        // 1. Create an Optional containing the string "hello"
        Optional<String> optional = Optional.of("hello");

        // 2. Transform the value inside the Optional to uppercase ("HELLO")
        String result = optional
                .map(String::toUpperCase)
                // 3. Filter the value - check if it starts with "H". "HELLO" starts with "H", so the Optional remains present.
                .filter(s -> s.startsWith("H"))
                // 4. If the Optional was empty, return "world". It's not empty, so return the value inside ("HELLO").
                .orElse("world");

        // 5. Print the final result
        System.out.println(result);
    }
}
