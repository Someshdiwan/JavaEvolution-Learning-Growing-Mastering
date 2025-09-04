/* The Greatest Common Divisor (GCD) is also known as the Highest Common Factor (HCF).
It is the largest positive integer that divides two or more numbers without leaving a remainder.
*/

public class GCDandHCF {
    // Method to calculate GCD using modulus (faster Euclidean algorithm).
    static int gcd(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        } return m;
    }
    public static void main(String[] args) {
        int a = 35, b = 56;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }
}
