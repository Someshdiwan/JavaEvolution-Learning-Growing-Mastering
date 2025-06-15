import java.util.Scanner;

public class NestedLoopdiamondpattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");

        int N = scanner.nextInt();

        for(int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++)
                System.out.print(" "); //Spaces printing

            for(int k = 1; k<= 2 * i - 1; k++)
                System.out.print("*"); //stars
            System.out.println();
        }
        for(int i = N-1; i>=1; i--) {
            for (int j = 1; j<=N - i; j++)
                System.out.print(" ");

            for(int k=1; k <= 2 * i - 1; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}

/*
You need to print a diamond shape using stars (*).

The diamond has two parts: the upper part and the lower part.

Upper Part:
The number of stars increases as you go down the rows.
The number of spaces decreases as you go down the rows.

Lower Part:
The number of stars decreases as you go down the rows.
The number of spaces increases as you go down the rows.

Example for N = 4:
   *       (3 spaces, 1 star)
  ***      (2 spaces, 3 stars)
 *****     (1 space, 5 stars)
*******    (0 spaces, 7 stars)
 *****     (1 space, 5 stars)
  ***      (2 spaces, 3 stars)
   *       (3 spaces, 1 star)

Key Points:
The diamond is centered, so spaces are used to align the stars.
The number of stars in each row follows a pattern: 2 * row - 1.
The number of spaces is calculated as N - row for the upper part and N - row for the lower part.
*/
