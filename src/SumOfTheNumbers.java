// Program to Print the Sum of First 10 Natural Numbers Using while Loop

//public class SumOfTheNumbers {
//    public static void main(String[] args) {
//        int i = 1;  // Initialize the counter
//        int sum = 0;  // Variable to store the sum
//
//        while (i <= 10) {
//            sum += i;  // Add the current number to the sum
//            i++;  // Increment the counter
//        }
//
//        System.out.println("Sum of first 10 natural numbers: " + sum);
//    }
//}


// Input from the user

import java.util.Scanner;
//public class SumOfTheNumbers
//{
//    public static void main(String[] args)
//    {
//        Scanner scanner = new Scanner(System.in);

//         Input from the user
//        System.out.print("Enter the value of n: ");
//        int n = scanner.nextInt();

//         Initialize variables
//        int sum = 0;
//        int counter = 1;

//         While loop to calculate the sum
//        while (counter <= n)
//        {
//            sum += counter;
//            counter++;
//        }

//         Display the result
//        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
//        scanner.close();
//    }
//}


import java.util.Scanner;

public class SumOfTheNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

//         Input from the user
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

//         Calculate sum using the formula
        int sum = n * (n + 1) / 2;

//         Display the result
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

        scanner.close();
    }
}
