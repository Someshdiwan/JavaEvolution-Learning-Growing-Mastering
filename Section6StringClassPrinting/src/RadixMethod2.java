import java.util.Scanner;

public class RadixMethod2 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number (using only 0s and 1s):");
        sc.useRadix(2);

        try {
            int x = sc.nextInt();
            System.out.println("Decimal value: " + x);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter a valid binary number (only 0s and 1s allowed)");
        } finally {
            sc.close();
        }
    }
}

/* for, example: "1010" in binary = (1×2³) + (0×2²) + (1×2¹) + (0×2⁰) = 8 + 0 + 2 + 0 = 10 in decimal */
