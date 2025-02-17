/*
StringBuffer Class
StringBuffer is a class that allows us to create and modify a flexible, expandable sequence of characters. It is thread-safe. Thismeans that it can be safely used when multiple threads are accessing or modifying the string concurrently. But due to synchronization, it is slower than StringBuilder.

StringBuffer str = new StringBuffer();
Example:

Below is an example which implements the StringBuffer class.

 Java program to demonstrate
 the StringBuffer class
*/

public class SBClass {
    public static void main(String args[])
    {

        // Creating a new StringBuffer
        StringBuffer str = new StringBuffer("Hello");
        str.append(" World!");
        System.out.println(str);
    }
}