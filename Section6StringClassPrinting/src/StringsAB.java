public class StringsAB {
    public static void main(String[] args) {
        String str = new String("Abdul Bari Sir Great");

        str = str.toUpperCase(); //Old string is lost and new is genrated.
        // Garbage collection.
        System.out.println(str);

        str = str.trim();
        System.out.println(str);

        String str1 = str.toUpperCase(); //Strings are immutable it genrates new strings and give it.
        // String str 1 is new reference for storing a main string for Upper case conversation.

        System.out.print(str1);

        int len = str.length();

        System.out.println(len);
        System.out.println(str.length()); //reference aahe string cha and charAt() is method.length() is also.

    }
}
