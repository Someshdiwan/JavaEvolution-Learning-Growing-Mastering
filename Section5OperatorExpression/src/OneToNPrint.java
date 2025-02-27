//1. Program to Print Numbers from 1 to 10 Using while Loop

public class OneToNPrint
{
    public static void main(String[] args)
    {
        int i = 1;  // Initialize the counter
        while (i <= 10)
        {
            System.out.println(i);  // Print the number
            i++;  // Increment the counter
        }
    }
}

/*
Input from users.

import java.util.Scanner;

public class OneToNPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to print from 1 to that number: ");

        int number = scanner.nextInt(); // Take input from the user

        // Check if the user entered a valid positive number

        if (number > 0) {
            for (int i = 1; i <= number; i++)
            {
                System.out.println(i); // Print numbers from 1 to the entered number
            }
        }
        else
        {
            System.out.println("Please enter a positive number.");
        }

        System.out.println("Program terminated.");

        scanner.close(); // Close the scanner to free resources
    }
}
*/