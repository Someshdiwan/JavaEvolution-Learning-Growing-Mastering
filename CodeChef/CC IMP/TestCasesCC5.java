import java.util.Scanner;

/*
You are given a program which does the following

Accepts the count of test cases - t - in the 1st line.
First line of each test case consists of an integer N
Outputs the integer which is greater than N by 1
Click on Run to check the result on custom inputs
Click on Submit to check the final verdict
*/

public class TestCasesCC5 {
    public static void main (String[] args)
    {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();

        for(int i=0; i<t; i++)
        {
            int n = read.nextInt();
            System.out.println(n+1);
        }
    }
}