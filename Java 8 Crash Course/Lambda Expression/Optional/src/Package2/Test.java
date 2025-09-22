package Package2;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        // Get an Optional value from a method.
        Optional<String> optional = getName(2);

        // Map converts String → Integer (length of the string).
        Optional<Integer> optional1 = optional.map(x -> x.length());

        // Print only if the value is present.
        optional1.ifPresent(System.out::println);
    }
    private static Optional<String> getName(int id) {
        // Here we just return "ram" for any id.
        return Optional.of("ram");
    }
}
