//Factorial of number
//5! = 1*2*3*4*5 = Is the factorial of number.

import java.util.Scanner;

public class ForLoopAB6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");

        int n = sc.nextInt();

        long fact =1;
        for(int i =1;  i<=n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of number is: "+fact);
    }
}
