//Program to Print the Table of a Given Number Using while Loop


/*import java.util.Scanner;

public class TableLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int i = 1;  // Counter for the table

        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }
    }
}*/

import java.util.Scanner;

public class TableLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a scanner object to take user input

        // Ask for the number to print its multiplication table

        System.out.print("Enter a number: ");
        int number = sc.nextInt(); // Read the number from the user


        // Ask for the limit up to which to print the multiplication table

        System.out.print("Enter the limit: ");
        int limit = sc.nextInt(); // Read the limit from the user

        int i = 1;  // Initialize the counter for the multiplication table

        // Loop to print the multiplication table from 1 to the user-defined limit

        while (i <= limit) {
            System.out.println(number + " x " + i + " = " + (number * i)); // Print the multiplication
            i++; // Increment the counter
        }
        sc.close();
    }
}
