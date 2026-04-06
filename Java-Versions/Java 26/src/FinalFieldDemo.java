import java.lang.reflect.Field;

public class FinalFieldDemo {

    public static void main(String[] args) {

        try {
            User user = new User("Somesh");

            System.out.println("Before reflection: " + user.name);

            Field field = User.class.getDeclaredField("name");
            field.setAccessible(true);              // deep reflection
            field.set(user, "Changed Name");        // JDK 26 warns by default

            System.out.println("After reflection: " + user.name);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class User {
    final String name;

    User(String name) {
        this.name = name;
    }
}

/*
What changed: Previous vs New

Previous Java style:
- final fields could still be changed using deep reflection
- setAccessible(true) + Field.set(...) could bypass immutability
- final was not fully enforced at runtime

New Java 26 style:
- JDK 26 warns when code mutates final fields through deep reflection
- This prepares for a future release where such mutation will be denied by default
- Goal: make final actually mean final

Why the new approach is better:
- Better integrity
- Better security
- More reliable immutability
- Allows stronger JVM optimizations

Pros:
1. Safer code
   - Prevents unexpected mutation of final fields

2. Better reliability
   - final fields behave more like developers expect

3. Better JVM optimization potential
   - Immutable fields are easier to optimize

4. Stronger platform integrity
   - Reflection loophole is being closed

Cons:
1. Legacy libraries may warn
   - Old frameworks using reflection may need updates

2. Migration effort
   - Some tools depend on final-field mutation

3. Behavior change over time
   - Warning now, stricter denial later

Best use case:
- Understanding JEP 500
- Learning why reflection-based mutation is discouraged
- Testing migration impact in older codebases

Compile and run:
javac FinalFieldDemo.java
java FinalFieldDemo

Helpful testing options in JDK 26:
java --illegal-final-field-mutation=warn FinalFieldDemo
java --illegal-final-field-mutation=debug FinalFieldDemo
java --illegal-final-field-mutation=deny FinalFieldDemo
java --enable-final-field-mutation=ALL-UNNAMED FinalFieldDemo
*/
