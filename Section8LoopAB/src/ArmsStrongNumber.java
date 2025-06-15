/*
Find a number is armstrong number or not.
A number is arms strong, sum of the cubs of digits of number, n =153,
3 cubes + 5 cubes + 1 cube = 153 then its Armstrong number.
*/

import java.util.Scanner;

public class ArmsStrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= scan.nextInt();

        int m=n;
        int sum=0;
        int r;

        while(n>0) {
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
        }
        if(sum==m)
            System.out.println("Its a Armstrong Number");
        else System.out.println("Its not a a Armstrong Number");
    }
}
