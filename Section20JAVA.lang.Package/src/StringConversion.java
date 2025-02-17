// Java program to demonstrate conversion from
// String to StringBuffer and StringBuilder
public class StringConversion {

    public static void main(String[] args) {

        // Custom input string
        String s = "Geeks";

        // Converting String object to StringBuffer object
        // by creating object of StringBuffer class
        StringBuffer sbr = new StringBuffer(s);

        // Reversing the string
        sbr.reverse();

        // Printing the reversed string
        System.out.println(sbr);

        // Converting String object to StringBuilder object
        StringBuilder sbl = new StringBuilder(s);

        // Adding it to string using append() method
        sbl.append("forGeeks");

        // Print and display the above appended string
        System.out.println(sbl);
    }
}
