import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        /*
            Syntax of for loop:
            for (initialisation; condition; increment/decrement) {
                // loop body
            }
        */

        // Q: Print numbers from 1 to 5 with step size of 2
//        for (int num = 1; num <= 5; num += 2) {
//            System.out.println(num); // prints: 1, 3, 5
//        }

        // Print "Hello World" n times using for loop
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt(); // Input n from user

//        for (int num = 1; num <= n; num++) {
////            System.out.print(num + " "); // Uncomment to print numbers from 1 to n
//            System.out.println("Hello World"); // Prints "Hello World" n times
//        }

        // Syntax of while loop:
        /*
            while (condition) {
                // loop body
            }
         */

        // Example of while loop printing numbers from 1 to 5
//        for (int num = 1; num <= 5; num += 2) {
//            System.out.println(num); // Prints: 1, 3, 5
//        }

        int num  = 1;
        while (num <= 5) {
            System.out.println(num); // Uncommented to actually print numbers from 1 to 5
            num += 1;
        }

        // Syntax of do-while loop:
        /*
            do {
                // loop body
            } while (condition);
         */

        int n = 1;
        do {
            System.out.println("Hello World"); // This will execute at least once even if condition is false
        } while (n != 1); // Since n == 1, this runs only once

    }
}
