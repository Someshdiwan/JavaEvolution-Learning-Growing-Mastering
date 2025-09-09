import java.util.Scanner;

public class PrimeNumbers {
    static boolean isPrime(int n) {
        for(int i = 2; i < n/2; i++) { // check divisibility
            if(n % i == 0) // n has a factor other than 1 and itself → not prime
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        // Loop through the range and print primes.
        for(int num = start; num <= end; num++) {
            if(isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
