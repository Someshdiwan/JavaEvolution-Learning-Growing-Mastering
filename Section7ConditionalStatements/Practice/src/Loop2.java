import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {

        /*
            Syntax of for loops:

            for (initialisation; condition; increment/decrement) {
                // body
            }
        */

        // Q: Print numbers from 1 to 5
        for (int num = 1; num <= 5; num += 2) {
            System.out.println(num); // prints 1, 3, 5 (incremented by 2)
        }

        // print numbers from 1 to n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // take input from user

        for (int num = 1; num <= n; num++) {
//            System.out.print(num + " "); // prints numbers from 1 to n on same line
            System.out.println("Hello World"); // prints "Hello World" n times
        }

        // while loops
        /*
            Syntax:
            while (condition) {
                // body
            }
         */

        // Same logic as first for-loop: print numbers from 1 to 5 using while loop
        int num  = 1;
        while (num <= 5) {
            System.out.println(num); // prints 1 2 3 4 5
            num += 1;
        }

        // do while
        /*
            Syntax:
            do {
                // body
            } while (condition);
         */

        int m = 1;
        do {
            System.out.println("Hello World"); // This will run at least once
        } while (m != 1); // Since condition is false, loop runs only once

    }
}
