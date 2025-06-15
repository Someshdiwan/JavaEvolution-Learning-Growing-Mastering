//Palindrome number means, a reverse of a number is a number then it is called as a palindrome number.

import java.util.Scanner;
public class PalindromeANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");

        int n = sc.nextInt();

        int m = n; //Hold A Number into another Variable.

        int rev =0, r;

        while (n>0) {
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        if(rev==m)
            System.out.println("Its a Palindrome number");
        else
            System.out.println("Its not a Palindrome number");
    }
}
