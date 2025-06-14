public class RegularExpressionString {
    public static void main(String[] args) {
        String str1 = "abcdf";
        String str2 = "abc3";
        String str3 = "abcccbbccdddddabcabcabcabca";

        System.out.println("For str1 regex 1 "+str1.matches(".*"));
        //Match any sequence of characters (including an empty string) Will match literally anything!

        System.out.println("For str1 regex 2 "+str1.matches("[a-z]*"));
        // Common variations:
        //- `[a-zA-Z]*` - matches both lowercase and uppercase letters
        //- `[a-z]+` - matches one or more lowercase letters (cannot be empty)
        //- `[a-z]{3}` - matches exactly 3 lowercase letters
        // as a complete pattern means: `[a-z]*`
        // Match zero or more lowercase letters

        System.out.println("For str2 regex 3 "+str2.matches("[a-z]*"));

        System.out.println("For str3 regex 4 "+str3.matches("[abc]+"));

        System.out.println("For str3 regex 5 "+str3.matches("[abc]*"));

        System.out.println("For str3 regex 6"+str3.matches("[ab]{1,2}"));


        String str4="john@gmail.com";
        String str5="john@gmail.com";

        System.out.println("For str4 regex 7 "+str4.matches(".*gmail.*"));
        System.out.println("For str5 regex 8 "+str5.matches("\\w*@gmail(.*)"));
    }
}
