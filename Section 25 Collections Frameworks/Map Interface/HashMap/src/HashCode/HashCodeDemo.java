package HashCode;

public class HashCodeDemo {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "CBA";

        System.out.println("HashCode of " + s1 + " = " + s1.hashCode());
        System.out.println("HashCode of " + s2 + " = " + s2.hashCode());

        Integer num = 100;
        System.out.println("HashCode of Integer 100 = " + num.hashCode());

        Double d = 12.34;
        System.out.println("HashCode of Double 12.34 = " + d.hashCode());
    }
}
