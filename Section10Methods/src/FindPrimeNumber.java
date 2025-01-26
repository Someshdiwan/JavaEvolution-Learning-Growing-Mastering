/* A prime number is a positive integer having exactly two factors, i.e. 1 and the number itself.
If p is a prime, then its only factors are necessarily 1 and p itself.
Any number that does not follow this is termed a composite number, which can be factored into other positive integers.*/

import java.util.Scanner;

public class FindPrimeNumber
{
    static boolean isPrime(int n)
    {
        for(int i=2; i<n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check prime or not: ");
        System.out.println(isPrime(scanner.nextInt()));
       /* System.out.println(isPrime((19)));*/
    }
}