import java.util.function.Function;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        // Using Function<T, R> to convert a String to its length.
        Function<String, Integer> stringLengthFunction = str -> str.length();

        // Applying the function
        int length = stringLengthFunction.apply("Java 8");
        System.out.println("Length of 'Java 8': " + length);
    }
}
