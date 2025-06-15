//Maximum of 3 numbers.

public class NestedIFAB {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 10;

        if(a > b && a > c) {
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
    }
}
