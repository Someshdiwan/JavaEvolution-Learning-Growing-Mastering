/*
String mirror - Double strings
Write a program in the IDE which does the following

Accepts the count of test cases - t - in the 1st line
First line of each test case consists of a string S
You need to perform the following operation
Create a variable X which contains the string S concatenated with the string S
Output X for each test case
*/

import java.util.Scanner;

public class StringCC2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // accept the count of test cases given in the 1st line
        int t = read.nextInt();

        for (int i = 0; i < t; i++) {
            String s = read.next();

            // create a variable X which stores the value of string S concatenated with itself
            String x = s + s;

            System.out.println(x);
        }
    }
}
