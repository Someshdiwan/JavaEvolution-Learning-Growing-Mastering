package ListDemo.ArrayListLinkedListStack;

import java.util.ArrayList;
import java.util.List;

public class ListED3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        // Method 1: Convert List to an Object array.
        // The toArray() method without arguments returns an Object[] because it does not know the specific type.

        Object[] objectArray = list.toArray();
        System.out.println("Object array:");
        for (Object obj : objectArray) {
            System.out.println(obj);
        }

        // Method 2: Convert List to a typed Integer array.
        // By passing an array of the desired type (new Integer[0]), the method returns an array of type Integer[].

        Integer[] integerArray = list.toArray(new Integer[0]);
        System.out.println("\nInteger array:");
        for (Integer num : integerArray) {
            System.out.println(num);
        }
    }
}

/*
In Java, every class implicitly extends the Object class,
which means that every object is an instance of Object. This leads to two main types of arrays you might encounter:

- Object Array (Object[])
  - An Object[] is an array where each element is of type Object.
  - Since every Java class is a subclass of Object, this kind of array can hold any type of object (e.g., Integer, String, etc.).
  - However, because it only knows the elements as Object`s, you lose the specific type information.

  For example, even if you stored Integer objects in an Object[], you would have to cast them back to Integer
  if you want to perform operations specific to Integer.

- Integer Array (Integer[])
  - An Integer[] is an array that is specifically designed to hold objects of the Integer type.
  - This makes it type-safe, meaning you can be sure that every element in the array is an Integer without needing to cast.
  - When you convert a List<Integer> to an array, you often want an Integer[] so that you retain this type information.

Why Does toArray() Return an Object Array by Default?

When you call the method list.toArray() without any arguments on a List<Integer>, it returns an Object[]
because the method signature is defined to return an array of Object—it doesn't have information about
the specific type (Integer) due to Java's type erasure (the process that removes generic type information at runtime).

How to Get an Integer Array:

To obtain an array of the specific type (Integer[]), you can use the overloaded version of toArray()
by providing an empty array of the target type.

For example:

Integer[] integerArray = list.toArray(new Integer[0]);

Here’s what happens in this method:
- You pass a new Integer[0] as a hint to the method about the desired array type.
- The method uses the type information from this array to return an array of type Integer[] containing the list's elements.

Summary

- Object[] array = list.toArray();
  Returns an array of type Object[]. It can hold any object, but you lose the type-specific information.

- Integer[] array1 = list.toArray(new Integer[0]);
  Returns an array of type Integer[]. This retains the specific type (Integer) of the list elements,
  making it safer and more convenient for further operations.

This distinction is important when you want to ensure type safety and avoid unnecessary casting in your code.
*/