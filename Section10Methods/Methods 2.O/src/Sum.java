import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);

        int ans2 = sum3(20, 30);
        System.out.println(ans2);

        int ans3 = sum4(100, 200, 300);
        System.out.println(ans3);
    }

    // pass the value of numbers when you are calling the method in main().
    static int sum3(int a, int b) {
        return a + b;
    }

    static int sum2() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        return sum;
        // System.out.println("This will never execute");
    }

    static int sum4(int i, int i1, int i2) {
        return i + i1 + i2;
    }
}
