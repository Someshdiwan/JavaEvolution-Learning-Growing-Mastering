import java.util.Scanner;

public class ArmNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sum = 0;

        System.out.println("\nCalculating sum of cubes of digits:");
        System.out.println("-----------------------------------");

        while (number > 0) {
            int digit = number % 10;
            int cube = digit * digit * digit;

            System.out.printf("Digit: %d, Cube: %d%n", digit, cube);

            sum += cube;
            number = number / 10;
        }

        System.out.println("-----------------------------------");
        System.out.println("Total sum: " + sum);

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number!");
        }

        scanner.close();
    }
}
