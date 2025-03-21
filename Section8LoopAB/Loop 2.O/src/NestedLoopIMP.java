import java.util.Scanner;

public class NestedLoopIMP {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}