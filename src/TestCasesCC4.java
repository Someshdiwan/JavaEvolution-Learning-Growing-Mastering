/*
Test cases with multiple types of input
In the previous problem, each testcase had 2 lines of input - each consisting of integers.
Test cases can also contain a combination of integers and strings.

        Task
Lets write a program in the IDE which performs the following:

The 1st line of input contains t - the count of testcases.
Each testcase consists of the following 2 lines of input.
        The 1st line of the testcase contains 2 integers - accept them as variables a and b.
        The 2nd line of the testcase contains 1 string - accept it as a variable s.
*/

import java.util.Scanner;

public class TestCasesCC4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // accept the count of test cases given in the 1st line
        int t = read.nextInt();

        // Run a loop to accept 't' inputs
        for(int i=0; i<t; i++)
        {
            // accept 2 integers on the 1st line of each test case
            int a = read.nextInt();
            int b = read.nextInt();

            // accept 1 string on the 2nd line of each test case

            String s = read.next();

            // output the 2 integers and 1 string on a single line for each test case
            System.out.println(a + " " + b + " " + s);
        }
    }
}

/*

To read integers and strings together, you can use the Scanner class in Java. Here's how you can do it:

Create a Scanner object to read input from the standard input (keyboard).
Use nextInt() to read integers.
Use next() to read strings

Key Points:
nextInt(): Reads the next integer from the input.
next(): Reads the next string (up to the next whitespace) from the input.
Order Matters: Ensure you read integers first and then the string, as per the problem's input format.


If the input has extra spaces, the Scanner class in Java will handle it automatically. The nextInt() and next() methods
ignore leading and trailing whitespace, so extra spaces won't affect the reading of integers or strings.

Why?
nextInt(): Skips any whitespace (including spaces, tabs, and newlines) and reads the next integer.
next(): Skips any leading whitespace and reads the next token (a sequence of characters until the next whitespace).


*/
