//Right angle triangle pattern

import java.util.Scanner;

public class NestedLoopCC {
    public static void main(String[] args) {
        //take input from user and print

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j<= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println(); //New line pe hoga print star
        }
    }
}
