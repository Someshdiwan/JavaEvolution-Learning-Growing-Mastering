import java.util.Scanner;

public class And {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number One: ");
        int num1 = scanner.nextInt();
        //take num1 as a input and checking whether it is divisible by 3 & 5.

        if (num1 % 3 == 0 && num1 % 5 == 0)
        {
            System.out.println("Divisible by both 3 and 5");
        } else {
            System.out.println("Not divisible by both 3 and 5");
        }

        System.out.println("Enter a Number Two: ");
        int num2 = scanner.nextInt();
        //take num2 and checking same whether it is divisible by 3 & 5.

        if (num2 % 3 == 0 && num2 % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        } else {
            System.out.println("Not divisible by both 3 and 5");
        }

        scanner.close();  // Close the scanner and resources.
    }
}
