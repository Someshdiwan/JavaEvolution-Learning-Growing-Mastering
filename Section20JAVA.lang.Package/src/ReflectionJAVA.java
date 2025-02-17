/*
Certainly! Reflection in Java is a powerful feature that allows you to inspect and manipulate classes, methods, and fields at runtime.
This can be particularly useful for tasks like debugging, testing, or creating more flexible and dynamic applications.
*/
import java.lang.reflect.*;


public class ReflectionJAVA {
    public static void main(String args[])
    {
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