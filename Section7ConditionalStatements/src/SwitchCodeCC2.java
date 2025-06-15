/*
Arithmetic operation:

Write a JAVA program that takes two numbers and an operator (+, -, *, /) as input.

Use a 'switch' statement to perform the corresponding arithmetic operation and print the result.

Check the sample input / output below for clarity.

(Note: It is guaranteed that in the hidden test cases, the second number will not be 0 during division.)
*/

import java.util.Scanner;

public class SwitchCodeCC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        //Take two integers as an input and choose a one operator's below this.
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
