import java.util.Scanner;

public class And {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first number
        int num1 = scanner.nextInt();
        if (num1 % 3 == 0 && num1 % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        } else {
            System.out.println("Not divisible by both 3 and 5");
        }

        // Read the second number
        int num2 = scanner.nextInt();
        if (num2 % 3 == 0 && num2 % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        } else {
            System.out.println("Not divisible by both 3 and 5");
        }

        scanner.close();  // Close the scanner
    }
}
