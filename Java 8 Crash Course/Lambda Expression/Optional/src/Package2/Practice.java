package Package2;

import java.util.Optional;

public class Practice {
    public static void main(String[] args) {
        // Get an Optional value
        Optional<String> optional = getName(2);

        // Transform value to uppercase using map()
        Optional<String> optionalUpper = optional.map(x -> x.toUpperCase());

        // Print only if present
        optionalUpper.ifPresent(System.out::println);
    }

    private static Optional<String> getName(int id) {
        return Optional.of("ram");
    }
}
