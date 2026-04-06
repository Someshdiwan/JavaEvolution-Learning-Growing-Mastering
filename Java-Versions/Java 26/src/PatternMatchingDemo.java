public class PatternMatchingDemo {

    public static void main(String[] args) {
        Object obj1 = "Hello Java 26";
        Object obj2 = 100;
        Object obj3 = 3.14;

        checkType(obj1);
        checkType(obj2);
        checkType(obj3);

        System.out.println("\n--- Switch Pattern Matching ---");
        printValue(obj1);
        printValue(obj2);
        printValue(obj3);
    }

    // instanceof pattern matching
    static void checkType(Object obj) {

        if (obj instanceof String s) {
            System.out.println("String value: " + s.toUpperCase());
        } else if (obj instanceof Integer i) {
            System.out.println("Integer value: " + (i + 10));
        } else {
            System.out.println("Other type: " + obj);
        }
    }

    // switch pattern matching
    static void printValue(Object obj) {

        switch (obj) {
            case String s -> System.out.println("String: " + s);
            case Integer i -> System.out.println("Integer: " + i);
            case Double d -> System.out.println("Double: " + d);
            default -> System.out.println("Unknown type");
        }
    }
}

/*
What changed: Previous vs New

Previous Java style:
- Manual type casting
- instanceof + casting separately
- More boilerplate code

Example:
if (obj instanceof String) {
    String s = (String) obj;
}

New Java 26 style:
- Pattern matching in instanceof
- Direct variable binding (String s)
- Cleaner switch with type patterns

Why the new approach is better:
- Less boilerplate
- More readable
- Safer (no casting errors)
- Cleaner switch statements

Pros:
1. Cleaner syntax
   - No explicit casting required

2. Safer code
   - Reduces ClassCastException

3. Better readability
   - Logic is more direct

4. Modern switch support
   - Works with multiple types easily

Cons:
1. Preview feature (some parts)
   - Requires newer Java versions

2. Learning curve
   - Different from traditional style

Best use case:
- Type checking logic
- Processing mixed object types
- Cleaner business logic

Compile and run:
javac PatternMatchingDemo.java
java PatternMatchingDemo
*/
