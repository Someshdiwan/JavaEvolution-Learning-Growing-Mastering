import java.util.Scanner;

public class NestedLoopCC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = scanner.nextInt();

        for(int i =1; i <=n; i++) {
            for(int j = 1; j<= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
