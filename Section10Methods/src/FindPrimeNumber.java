/* A prime number is a positive integer having exactly two factors, i.e. 1 and the number itself.
If p is a prime, then its only factors are necessarily 1 and p itself.
Any number that does not follow this is termed a composite number, which can be factored into other positive integers.
*/

import java.util.Scanner;

public class FindPrimeNumber {
    static boolean isPrime(int n)
    //true or false. initialize the method.
    {
        for(int i = 2; i<n/2; i++) //assign a value of i=2 and increment by 1 everytime when loop is running.
        {
            if(n % i == 0) //means n has a factor other than 1 and itself → not prime.
                return false;
        } return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check prime or not: ");

        System.out.println(isPrime(scanner.nextInt()));
       /* System.out.println(isPrime((19)));*/
    }
}
