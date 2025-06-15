/*
Find num is odd or even
How check even or odd exactly divisible by 2.
Remainder is zero means Even and Remainder is one then-its odd.
*/

import java.util.Scanner;

public class ConditionalStatementsAB3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = scanner.nextInt();

        if(n%2 == 0){
            System.out.println("Number is even");
        } else {
            System.out.println("number is odd");
        }
    }
}
