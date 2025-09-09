import java.util.Scanner;
import java.util.Scanner;

public class PrintPrimeInBetween {
    static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime

        // Check divisibility up to square root of n
        for(int i = 2; i * i <= n; i++) {
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

        for(int num = start; num <= end; num++) {
            if(isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
