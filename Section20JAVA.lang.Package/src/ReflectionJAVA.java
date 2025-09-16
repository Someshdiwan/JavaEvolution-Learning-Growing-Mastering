import java.lang.reflect.*;

public class ReflectionJAVA {
    public static void main(String args[]) {
        try {
            Class c = Class.forName(args[0]);
            Method m[] = c.getDeclaredMethods();

            for (int i = 0; i < m.length; i++)
                System.out.println(m[i].toString());
        }
        catch (Throwable e) {
            System.err.println(e);
        }
    }
}

/*
Certainly! Reflection in Java is a powerful feature that allows you to inspect and manipulate classes, methods, and fields at runtime.
This can be particularly useful for tasks like debugging, testing, or creating more flexible and dynamic applications.

1. Command line se run karte waqt:
   java ReflectionJAVA java.util.ArrayList
   Ye ArrayList class ke saare declared methods print karega.

2. `Class.forName("package.ClassName")`:
   Dynamically load karta hai class ko runtime par.

3. `getDeclaredMethods()`:
   Sirf us class ke methods deta hai (private + protected + public).
   Agar tum `getMethods()` use karoge to uske parent (Object class) ke bhi public methods show honge.

4. Reflection ka use cases:
   Debugging tools
   Unit testing frameworks (JUnit)
   Dependency Injection frameworks (Spring)
   Serialization / Deserialization libraries (Jackson)

5. Drawbacks:
   Thoda slow hota hai (direct method call se zyada overhead).
   Security risk hota hai agar private fields/methods ko expose kar diya jaye.
*/
