/*public class Enum7 Write a program in Java to describe the use of values(), valueOf(), and ordinal() methods in the enum.

Ans:*/

// Java program to demonstrate working of values(),
// ordinal() and valueOf()

enum Color12 {
    RED,
    GREEN,
    BLUE;
}

class Test12 {
    public static void main(String[] args)
    {
        // Calling values()
        Color12 arr[] = Color12.values();

        // enum with loop
        for (Color12 col : arr)
        {
            // Calling ordinal() to find index
            // of color.
            System.out.println(col + " at index " + col.ordinal());
        }

        // Using valueOf(). Returns an object of
        // Color with given constant.
        // Uncommenting second line causes exception
        // IllegalArgumentException
        System.out.println(Color.valueOf("RED"));
        // System.out.println(Color.valueOf("WHITE"));
    }
}