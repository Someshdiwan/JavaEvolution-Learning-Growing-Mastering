public class RegularExpressionStringAB {
    public static void main(String[] args) {
        String str1 = "f";
        String str2 = "8";
        String str3 = "%";
        String str4 = "abc";
        String str5 = "a";

        // "." matches any single character
        System.out.println(str1.matches(".")); // true - matches any single character

        // Literal match - matches exactly "8"
        System.out.println(str2.matches("8")); // true - exact match

        // "." matches any single character
        System.out.println(str3.matches(".")); // true - matches any single character

        // [abc] matches single character that is either a, b, or c
        System.out.println(str4.matches("[abc]")); // false - matches only single character from set

        // Literal match - matches exactly "b"
        System.out.println(str4.matches("b")); // false - str4 is "abc", not "b"

        // Matches exactly "ab"
        System.out.println(str5.matches("ab")); // false - str5 is "a", not "ab"

        // ^abc matches string that starts with "abc"
        System.out.println(str5.matches("^abc")); // false - str5 is "a", not starting with "abc"

        // [a-z0-9] matches single character that is either lowercase letter or digit
        System.out.println("Hmm " + str5.matches("[a-z0-9]")); // true - 'a' is in range a-z

        // [abc] matches single character from the set {a,b,c}
        String str6="a";
        System.out.println(str6.matches("[abc]")); // true - 'a' is in the set

        // [^abc] matches single character that is NOT a, b, or c
        String str7="p";
        System.out.println(str7.matches("[^abc]")); // true - 'p' is not in {a,b,c}

        // [a-zA-Z0-9] matches single character that is letter (any case) or digit
        String str8="7";
        System.out.println(str8.matches("[a-zA-Z0-9]")); // true - '7' is a digit

        // a|b matches either "a" or "b"
        String str9="b";
        System.out.println(str9.matches("a|b")); // true - str9 is "b"

        // \w matches any word character (letter, digit, or underscore)
        String str10="b";
        System.out.println(str10.matches("\\w")); // true - 'b' is a word character

        // \d matches any digit
        String str11="5";
        System.out.println(str11.matches("\\d")); // true - '5' is a digit

        // \D matches any non-digit character
        String str12="$";
        System.out.println(str12.matches("\\D")); // true - '$' is not a digit
    }
}
