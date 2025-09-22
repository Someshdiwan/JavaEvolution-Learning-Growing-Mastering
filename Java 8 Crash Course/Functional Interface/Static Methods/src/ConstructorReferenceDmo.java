import java.util.function.Supplier;

class Example {
    Example() {
        System.out.println("Example constructor called!");
    }
}
public class ConstructorReferenceDmo {
    public static void main(String[] args) {
        // Using a constructor reference
        Supplier<Example> supplier = Example::new;

        // Calling get() will invoke the constructor
        Example ex = supplier.get();
    }
}
