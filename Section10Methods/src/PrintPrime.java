import java.util.Scanner;

public class PrintPrime {
    static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime

        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0)
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

        int count = 0;
        for(int num = start; num <= end; num++) {
            if(isPrime(num)) {
                System.out.print(num + "\t"); // tab space between numbers
                count++;
                if(count % 10 == 0) { // print 10 numbers per line
                    System.out.println();
                }
            }
        }
    }
}
