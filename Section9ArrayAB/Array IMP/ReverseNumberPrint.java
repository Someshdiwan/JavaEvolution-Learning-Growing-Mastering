import java.util.Scanner;

public class ReverseNumberPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ask the user for the number of natural numbers to print
        System.out.print("Enter the number, to print natural numbers in reverse order: ");
        int n = scanner.nextInt();

        System.out.println("The first " + n + " natural numbers in reverse order are:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}

/*
Do-While:

Initialize the loop variable

int i = n;

Use a do-while loop to print numbers in reverse order.

        do {
                System.out.print(i + " ");
        i--; // Decrement the counter
        } while (i >= 1);
        scanner.close();

While:

Initialize the loop variable

int i = n;

Use a while loop to print numbers in reverse order

        while (i >= 1) {
        System.out.print(i + " ");
        i--; // Decrement the counter
        }
        scanner.close();
*/
