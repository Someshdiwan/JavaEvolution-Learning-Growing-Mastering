import java.util.Optional; // Import the Optional class

public class OptionalDemo {
    public static void main(String[] args) {
        // Create an Optional containing the string "hello"
        Optional<String> optional = Optional.of("hello");

        // Transform the value inside the Optional to uppercase ("HELLO")
        String result = optional
                .map(String::toUpperCase)
                // Filter the value - check if it starts with "H". "HELLO" starts with "H", so the Optional remains present.
                .filter(s -> s.startsWith("H"))
                // If the Optional was empty, return "world". It's not empty, so return the value inside ("HELLO").
                .orElse("world");
        System.out.println(result);
    }
}
