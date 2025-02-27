public class RegularExpressionStringAB
{
    public static void main(String[] args) {
        String str1 = "f";
        String str2 = "8";
        String str3 = "%";
        String str4 = "abc";
        String str5 = "a";



        System.out.println(str1.matches("."));
        System.out.println(str2.matches("8"));
        System.out.println(str3.matches("."));
        System.out.println(str4.matches("[abc]"));
        System.out.println(str4.matches("b"));
        System.out.println(str5.matches("ab"));
        System.out.println(str5.matches("^abc"));
        System.out.println("Hmm " + str5.matches("[a-z0-9]"));

        String str6="a"; //b,c
        System.out.println(str6.matches("[abc]"));

        String str7="p"; //true for alphabets other than abc
        System.out.println(str7.matches("[^abc]"));

        String str8="7";//A,a7
        System.out.println(str8.matches("[a-zA-Z0-9]"));//[a-z][0-9]

        String str9="b";
        System.out.println(str9.matches("a|b"));

        String str10="b";
        System.out.println(str10.matches("\\w"));

        String str11="5";
        System.out.println(str11.matches("\\d"));

        String str12="$";
        System.out.println(str12.matches("\\D"));
    }
}
