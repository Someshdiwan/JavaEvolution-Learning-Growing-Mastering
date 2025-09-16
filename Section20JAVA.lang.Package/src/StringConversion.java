public class StringConversion {
    public static void main(String[] args) {
        String s = "Geeks";

        // Converting String object to StringBuffer object by creating an object of StringBuffer class.
        StringBuffer sbr = new StringBuffer(s);

        // Reversing the string.
        sbr.reverse();
        System.out.println(sbr);

        // Converting String object to StringBuilder object.
        StringBuilder sbl = new StringBuilder(s);

        // Adding it to string using append() method.
        sbl.append("forGeeks");

        // Print and display the above appended string.
        System.out.println(sbl);
    }
}

/*  Java program to demonstrate conversion from String to StringBuffer and StringBuilder.

1. String → Immutable (once created, modify nahi hota).
   Example: "Geeks" me kuch bhi add/modify karoge to new String object banega.

2. StringBuffer → Mutable + Thread-safe
   - Isliye reverse(), append(), insert(), delete() directly existing object pe kaam karte hain.

3. StringBuilder → Mutable + Faster (NOT synchronized)
   - Single-threaded applications me zyada fast hota hai.

4. Conversions:
   - String → StringBuffer:  new StringBuffer(s)
   - String → StringBuilder: new StringBuilder(s)

5. Example Output:
   - Reversed StringBuffer: skeeG
   - Appended StringBuilder: GeeksforGeeks
*/
