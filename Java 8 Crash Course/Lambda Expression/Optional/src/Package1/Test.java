package Package1;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        Optional<String> optional = getName(2);

        // Convert to uppercase and print.
        Optional<String> optionalUpper = optional.map(x -> x.toUpperCase());
        optionalUpper.ifPresent(System.out::println);

        // Convert to length (Integer).
        Optional<Integer> optionalLength = optional.map(x -> x.toUpperCase())
                .map(x -> x.length());
        optionalLength.ifPresent(System.out::println);
    }

    private static Optional<String> getName(int id) {
        return Optional.of("ram");
    }
}
