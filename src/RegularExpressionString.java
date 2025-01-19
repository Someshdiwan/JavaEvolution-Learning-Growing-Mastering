public class RegularExpressionString {
    public static void main(String[] args) {
        String str1 = "abcdf";
        String str2 = "abc3";
        String str3 = "abcccbbccdddddabcabcabcabca";

        System.out.println(str1.matches(".*"));
        System.out.println(str1.matches("[a-z]*"));
        System.out.println(str2.matches("[a-z]*"));
        System.out.println(str3.matches("[abc]+"));
        System.out.println(str3.matches("[abc]*"));
        System.out.println(str3.matches("[ab]{1,2}"));



        String str4="john@gmail.com";
        String str5="john@gmail.com";

        System.out.println(str4.matches(".*gmail.*"));
        System.out.println(str5.matches("\\w*@gmail(.*)"));
    }
}
