// Java program to demonstrate difference between
// String, StringBuilder and StringBuffer
class SvsSBvsSB {

    // Method 1
    // Concatenates to String
    public static void concat1(String s1)
    {
        s1 = s1 + "forgeeks";
    }

    // Method 2
    // Concatenates to StringBuilder
    public static void concat2(StringBuilder s2)
    {
        s2.append("forgeeks");
    }

    // Method 3
    // Concatenates to StringBuffer
    public static void concat3(StringBuffer s3)
    {
        s3.append("forgeeks");
    }

    // Method 4
    // Main driver method
    public static void main(String[] args)
    {
        // Custom input string
        // String 1
        String s1 = "Geeks";

        // Calling above defined method
        concat1(s1);

        // s1 is not changed
        System.out.println("String: " + s1);

        // String 1
        StringBuilder s2 = new StringBuilder("Geeks");

        // Calling above defined method
        concat2(s2);

        // s2 is changed
        System.out.println("StringBuilder: " + s2);

        // String 3
        StringBuffer s3 = new StringBuffer("Geeks");

        // Calling above defined method
        concat3(s3);

        // s3 is changed
        System.out.println("StringBuffer: " + s3);
    }
}
/*
Concat1: In this method, the string “Geeks” is passed, and we perform s1 = s1 + “forgeeks”. Since String is immutable, a new string is created, and s1 in concat1() points to it. The original string in main() remains unchanged.
Concat2: Here, s2.append(“forgeeks”) modifies the original StringBuilder object. Since StringBuilder is mutable, it updates the string directly in main() to “Geeksforgeeks”.
Concat3: StringBuffer and StringBuilder are similar, but StringBuffer is thread-safe due to synchronized methods, while StringBuilder is not, making it thread-unsafe.

Note: Geeks now you must be wondering when to use which one, do refer below as follows:


If a string is going to remain constant throughout the program, then use the String class object because a String object is immutable.
If a string can change (for example: lots of logic and operations in the construction of the string) and will only be accessed from a single thread, using a StringBuilder is good enough.
If a string can change and will be accessed from multiple threads, use a StringBuffer because StringBuffer is synchronous, so you have thread-safety.
If you don’t want thread-safety than you can also go with StringBuilder class as it is not synchronized*/