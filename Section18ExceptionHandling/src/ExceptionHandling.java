import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two Numbers: ");

        int d = sc.nextInt();
        int f = sc.nextInt();
        int g = 0;  // Initialize to avoid compilation errors.

        int a = 10;
        int b = 0;
        int c = 0;  // Initialize to avoid errors.

        // Handle division of a / b separately
        try {
            c = a / b;
            System.out.println("Result of a / b: " + c);
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide a by b. " + e);
        }

        // Handle user input division separately
        try {
            g = d / f;
            System.out.println("Result of d / f: " + g);
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Denominator should not be zero. " + e);
        }

        System.out.println("Bye");
        sc.close();
    }
}
