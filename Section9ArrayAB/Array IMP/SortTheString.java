public class SortTheString {
    public static void main(String[] args) {
        String arr[]={"java","python","pascal","smalltalk","ada","basic"};

        java.util.Arrays.sort(arr);

        for(String x:arr)
            System.out.println(x);
    }
}

/*
Array Initialization:

An array arr is created with strings: {"java", "python", "pascal", "smalltalk", "ada", "basic"}.

Sorting:
The java.util.Arrays.sort(arr) method is used to sort the array.

It sorts the elements in natural (lexicographical) order by default.

4. What would happen if one of the strings in the array had an uppercase letter, e.g., "Java" instead of "java"?

Strings with uppercase letters will be sorted before lowercase strings because uppercase letters have
lower Unicode values than lowercase letters.

For example,
if the array were {"Java", "python", "pascal", "smalltalk", "ada", "basic"}, the output would be:

5. Can the Arrays.sort() method sort the strings in reverse order? How would you modify the code to achieve this?
Yes, to sort strings in reverse order, use Arrays.sort() with a custom comparator, such as:

java.util.Arrays.sort(arr, java.util.Collections.reverseOrder());

6. What is the time complexity of the Arrays.sort() method used in the program?
The time complexity of Arrays.sort() for an array of strings is O(n log n), where n is the number of elements in the
array.

This is because it uses the dual-pivot Quicksort algorithm for non-primitive types.

10. How does the Arrays.sort() method compare strings internally? Discuss how it uses lexicographical order.
Arrays.sort() internally uses the compareTo() method of the String class.
The compareTo() method compares strings lexicographically by comparing their Unicode values character by character.
If one string is a prefix of the other, the shorter string is considered smaller.
*/
