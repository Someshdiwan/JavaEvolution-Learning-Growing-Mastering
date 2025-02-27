public class StringC {
    public static void main(String[] args)
    {
        String s = "abc";
        char[] sArray = s.toCharArray();
        sArray[2] = 'd';
        s = new String(sArray);
        System.out.println(s);
    }
}

/*
The toCharArray() method in Java converts a String into a char array. For example, if you have a string "abc",
calling toCharArray() will return a char array like this: {'a', 'b', 'c'}.

s.toCharArray() converts the string "abc" into a char array {'a', 'b', 'c'}.

You then modify the third character (sArray[2]) from 'c' to 'd', so the array becomes {'a', 'b', 'd'}.

Finally, you convert the modified char array back into a String using new String(sArray), resulting in "abd".

Converting a String to a char array is useful when you need to manipulate individual characters in the string.

Strings in Java are immutable, meaning once created, they cannot be changed. However, a char array is mutable,
so you can modify its elements directly.

You wanted to change the third character ('c') to 'd'.

Since String is immutable, you first converted it to a char array using toCharArray().

Then, you modified the array (sArray[2] = 'd').
Finally, you converted the modified char array back to a String.
*/