public class StringAB3 {
    public static void main(String[] args) {
        String str1 = "Mr. Shahrukh Khan";

        System.out.println(str1.endsWith("Khan"));

        System.out.println(str1.charAt(4));

        //if you want display char of all the strings
        for(int i=0; i<str1.length(); i++)
        {
            System.out.print(str1.charAt(i));
        }

        System.out.println(str1.startsWith("Shah", 4));
    }
}
