import java.util.Scanner;

public class TestCasesCC3
{
    public static void main(String[] args)
        {
            Scanner read = new Scanner(System.in);
            // accept the count of test cases given in the 1st line
            int t = read.nextInt();

            // Run a loop to accept 't' inputs
            for(int i=0; i<t; i++)
            {
                // accept 5 integers in each test case
                int a = read.nextInt();
                int b = read.nextInt();
                int c = read.nextInt();
                int d = read.nextInt();
                int e = read.nextInt();

                // output the 5 integers on a single line for each test case
                System.out.println(a + " " + b + " " + c + " " + d + " " + e);
            }
        }
    }

/*
Let's write a program in the IDE which performs the following:

The 1st line of input is an integer - T - the count of test cases.
Each test case consists of 2 lines of input.
The 1st line of input has 2 space separated integers - accept them as variables a and b .
The 2nd line of input has 3 space separated integers - accept them as variables c, d and e.


To handle multiple test cases, you need to use a loop that runs for each test case. Here's how you can do it:

Read the number of test cases (T) from the first line of input.
Use a loop to process each test case one by one.
For each test case, read the required input lines and process them

Key Points:
T is the number of test cases. It is read once at the beginning.
        The for loop runs T times, once for each test case.

Inside the loop:
Read the first line of the test case (2 integers: a and b).
Read the second line of the test case (3 integers: c, d, and e).
Print all 5 integers on a single line.
*/
