public class WrapperDemo3 {
    public static void main(String[] args) {
        //Character Class
        Character a1='a';
        a1 = Character.toUpperCase(a1);
        System.out.println(a1);

        String str = Character.toString(a1);
        System.out.println(str);

        /*
        Character a1='a';
        Character.toUpperCase(a1);
        System.out.println(a1);

        Why doesn't a1 change?

        Immutability: The Character class is immutable, meaning its value cannot be changed once assigned.

        Return Value Not Used: Character.toUpperCase(a1) returns a new character ('A') but does not modify a1 in place.

        How to Fix It?
        You need to store the returned value from toUpperCase(a1),like this:

        Character a1 = 'a';
        a1 = Character.toUpperCase(a1);
        System.out.println(a1);  // Prints 'A'

        Similarly, Character.toString(a1) returns a String representation of a1, but does not modify a1.
        */

        //Boolean Class
        Boolean b;

        //Boolean.

    }
}
