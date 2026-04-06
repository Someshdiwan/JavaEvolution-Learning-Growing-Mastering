import java.lang.LazyConstant;
import java.util.logging.Logger;

public class LazyConstantsDemo {

    private static final LazyConstant<Logger> LOGGER =
        LazyConstant.of(() -> {
            System.out.println("Creating Logger only once...");
            return Logger.getLogger(LazyConstantsDemo.class.getName());
        });

    public static void main(String[] args) {

        System.out.println("Program started");

        System.out.println("\nFirst call:");
        useLogger();

        System.out.println("\nSecond call:");
        useLogger();
    }

    static void useLogger() {
        LOGGER.get().info("Lazy constant is being used");
    }
}

/*
What changed: Previous vs New

Previous Java style:
- Usually we used eager initialization with final fields
- Object created when class/object loads
- Resource may be created even if never used

Example:
private static final Logger LOGGER =
        Logger.getLogger(LazyConstantsDemo.class.getName());

New Java 26 style:
- Uses LazyConstant
- Value is created only when needed
- After initialization, value behaves like a constant

Why the new approach is better:
- Delays object creation until first use
- Useful for expensive objects
- Still gets JVM constant-like optimizations
- Cleaner than manual lazy initialization

Pros:
1. Better startup behavior
   - Expensive object is not created immediately

2. Cleaner code
   - No manual null checks or synchronized blocks

3. Thread-safe
   - Value is set at most once

4. Optimized by JVM
   - Lazy constants are treated as true constants

Cons:
1. Preview feature
   - LazyConstant is still a preview API in Java 26

2. New API
   - Developers need to learn it

3. Not needed everywhere
   - Simple objects may not need lazy initialization

Best use case:
- Logger creation
- Heavy configuration objects
- Expensive services initialized only when required

Compile and run:
javac --enable-preview --release 26 LazyConstantsDemo.java
java --enable-preview LazyConstantsDemo
*/
