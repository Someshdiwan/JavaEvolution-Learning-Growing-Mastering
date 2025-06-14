import java.util.Scanner;

public class And2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        if (num1 == 0) {
            System.out.println("Zero is divisible by both 3 and 5");
        } else if (num1 % 3 == 0 && num1 % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        } else {
            System.out.println("Not divisible by both 3 and 5");
        }

        int num2 = scanner.nextInt();
        if (num2 == 0) {
            System.out.println("Zero is divisible by both 3 and 5");
        } else if (num2 % 3 == 0 && num2 % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        } else {
            System.out.println("Not divisible by both 3 and 5");
        }

        scanner.close();
    }
}
