import java.util.Scanner;

public class And1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a Number: ");
        int num1 = sc.nextInt();
        if (num1 % 3 == 0) {
            if (num1 % 5 == 0) {
                System.out.println("Divisible by both 3 and 5");
            } else {
                System.out.println("Not divisible by both 3 and 5");
            }
        } else {
            System.out.println("Not divisible by both 3 and 5");
        }

        System.out.println("Enter a Number: ");
        int num2 = sc.nextInt();
        if (num2 % 3 == 0) {
            if (num2 % 5 == 0) {
                System.out.println("Divisible by both 3 and 5");
            } else {
                System.out.println("Not divisible by both 3 and 5");
            }
        } else {
            System.out.println("Not divisible by both 3 and 5");
        }

        sc.close();  // Close the scanner
    }
}
