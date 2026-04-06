public class AotCachingDemo {

    public static void main(String[] args) {

        System.out.println("Program started");

        long start1 = System.currentTimeMillis();
        createObjectsWithoutCaching();
        long end1 = System.currentTimeMillis();

        System.out.println("Time without caching: " + (end1 - start1) + " ms");

        long start2 = System.currentTimeMillis();
        createObjectsWithCaching();
        long end2 = System.currentTimeMillis();

        System.out.println("Time with caching: " + (end2 - start2) + " ms");
    }

    // Simulates repeated object creation (no caching)
    static void createObjectsWithoutCaching() {
        for (int i = 0; i < 1_000_000; i++) {
            HeavyObject obj = new HeavyObject("Data");
        }
    }

    // Simulates caching (reuse same object)
    static void createObjectsWithCaching() {
        HeavyObject cached = new HeavyObject("Data");

        for (int i = 0; i < 1_000_000; i++) {
            HeavyObject obj = cached; // reuse
        }
    }
}

// Simulated heavy object
class HeavyObject {
    private String data;

    HeavyObject(String data) {
        this.data = data;
    }
}

/*
What changed: Previous vs New

Previous Java style:
- Objects created repeatedly at runtime
- No built-in caching at JVM level
- Higher memory and CPU usage

New Java 26 concept:
- AOT (Ahead-of-Time) Object Caching
- JVM can reuse objects instead of recreating them
- Improves startup and runtime performance

Why the new approach is better:
- Reduces object creation overhead
- Faster application startup
- Better memory efficiency

Pros:
1. Improved performance
   - Less object creation

2. Better memory usage
   - Reuses objects

3. Faster startup
   - Useful for large applications

4. JVM optimization
   - Handled internally

Cons:
1. Not directly controllable in code
   - Mostly JVM-level feature

2. Conceptual understanding required
   - Not obvious from normal coding

3. Benefit depends on use case
   - More useful in large-scale apps

Best use case:
- Large applications
- High-performance systems
- Repeated object creation scenarios

Note:
This example simulates the idea of caching.
Actual AOT caching is handled internally by JVM.

Compile and run:
javac AotCachingDemo.java
java AotCachingDemo
*/
