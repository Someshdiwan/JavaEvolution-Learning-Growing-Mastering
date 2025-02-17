/*
This conversion can be performed using toString() method which is overridden in both StringBuffer and StringBuilder classes. Below is the Java program to demonstrate the same.

Note: While we use toString() method, a new String object(in Heap area) is allocated and initialized to the character sequence currently represented by the StringBuffer object, which means the subsequent changes to the StringBuffer object do not affect the contents of the String object.

Example:
Java Program to Demonstrate Conversion from
String to StringBuffer and StringBuilder
*/
public class SBvsSB {

    public static void main(String[] args) {

        // Creating objects of 
        // StringBuffer class
        StringBuffer sbr = new StringBuffer("Geeks");
        StringBuilder sbl = new StringBuilder("Hello");

        // Converting StringBuffer object to String
        // using toString() method
        String s1 = sbr.toString();

        // Printing the above string
        System.out.println(
                "StringBuffer object to String: ");
        System.out.println(s1);

        // Converting StringBuilder object to String
        String s2 = sbl.toString();

        // Printing the above string
        System.out.println(
                "StringBuilder object to String: ");
        System.out.println(s2);

        // Changing StringBuffer object sbr
        // but String object(s1) doesn't change
        sbr.append("ForGeeks");

        // Printing the above two strings on console
        System.out.println(sbr);
        System.out.println(s1);
    }
}