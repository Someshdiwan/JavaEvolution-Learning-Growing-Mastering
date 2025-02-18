public class TestString {
    public static void main(String[] args) {
        String name ="Ram";
        int length  = name.length();
        System.out.println(length);
        //name.length();
        //o se leker length - 1;

        String name1 = "Virat Kohli";
        char c = name1.charAt(6);
        char c1 = name1.charAt(length -1);

        System.out.println(c);
        System.out.println(c1);

        //System.out.println(1==1); //equality check kar raha hai premitive data type ko.
        System.out.println(name.equals(name1));
        System.out.println(name.equalsIgnoreCase(name1));

        String str1 = "remote";
        String str2 = "car";
        int i = str1.compareTo(str2);
        System.out.println(i);


        //check ASCII Value
        System.out.println('r'+0);
        System.out.println('c'+0); //114-99=15
    }
}