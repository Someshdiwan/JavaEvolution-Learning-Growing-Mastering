public class ForLoop {
    public static void main(String[] args) {
        String str = "Chill bro";
        for (int i = 0; i <str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}

/*
the String class provides several methods to manipulate and interact with strings.
Two commonly used methods are charAt() and length().
Let's understand these methods in detail.
The charAt() method returns the character at a specific position (index) in a string.
The argument index must be a valid position in the string; otherwise, a StringIndexOutOfBoundsException is thrown.

Error Handling:
If you try to access an index outside the string's range, it throws an exception.
String str = "Java";
System.out.println(str.charAt(10));  // This will throw StringIndexOutOfBoundsException
length()
The length() method returns the total number of characters in a string.
*/
