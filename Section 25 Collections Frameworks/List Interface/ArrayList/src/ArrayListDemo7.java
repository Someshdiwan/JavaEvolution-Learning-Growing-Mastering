import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ArrayListDemo7 {
    public static void main(String[] args) {
        // Get the Class object of ArrayList
        Class<?> classOB = ArrayList.class;

        // Get all constructors of ArrayList
        Constructor<?> [] declaredConstructors = classOB.getDeclaredConstructors();

        // Get all methods of ArrayList
        Method[] declaredMethods = classOB.getDeclaredMethods();

        // Print all constructor names
        for(Constructor<?> constructor : declaredConstructors) {
            System.out.println(constructor.getName());
        }

        // Print all method names
        for(Method method : declaredMethods) {
            System.out.println(method.getName());
        }
    }
}
