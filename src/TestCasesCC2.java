/*import java.util.Scanner;

class TestCasesCC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0; i<t; i++)
        {
            int n = scanner.nextInt();
            System.out.println(n);
        }
    }
}*/

/*
What are test cases
In the previous problem - we wrote the program to accept 5 inputs on 5 separate lines.

What will we do if we expect 100 inputs or test cases?
What about 100,000 inputs or test cases?
Task
Let's solve a simple problem.
Write a program in the IDE which does the following:

Accepts the count of test cases - T - as an integer input given in the 1st line.
This is followed by T lines - Each line contains an integer N.
For each test cases, prints out the integer N to console on a separate line (our Input mirror problem).

*/
import java.util.Scanner;

class TestCaseCC2
{
    public static void main (String[] args)
    {
        Scanner read = new Scanner(System.in);
        /* accept the count of test cases given in the 1st line*/
        int t = read.nextInt();

        /* Run a loop to accept 't' inputs*/
        for(int i=0; i<t; i++)
        {
            /* accept an integer N in each test case*/
            int n = read.nextInt();
            /*output the number mirror for each test case "println" prints output followed with a new line.*/
            System.out.println(n);
        }
    }
}