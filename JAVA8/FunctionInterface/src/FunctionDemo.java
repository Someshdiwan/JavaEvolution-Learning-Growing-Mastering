import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        // Using Function<T, R> to convert a String to its length
        Function<String, Integer> stringLengthFunction = str -> str.length();

        // Applying the function
        int length = stringLengthFunction.apply("Java 8");
        System.out.println("Length of 'Java 8': " + length);
    }
}

//### **Example of `Function<T, R>` in Java 8
//- `Function<T, R>` is a **functional interface** from `java.util.function` package.
//- `T` is the input type (`String` in this case).
//- `R` is the return type (`Integer` in this case).
//- The **lambda expression** (`str -> str.length()`) defines the function body.
//- `.apply("Java 8")` executes the function.

//### **Other Useful Java 8 Functional Interfaces**
//| Functional Interface | Description |
//|----------------------|-------------|
//| `Function<T, R>`    | Takes an argument `T` and returns `R`. |
//| `Predicate<T>`      | Returns `boolean` (used for filtering). |
//| `Consumer<T>`       | Consumes `T` without returning a value. |
//| `Supplier<T>`       | Supplies a value of `T` (no input). |
