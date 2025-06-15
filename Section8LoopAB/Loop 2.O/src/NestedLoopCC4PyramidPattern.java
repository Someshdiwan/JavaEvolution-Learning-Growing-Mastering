import java.util.Scanner;

public class NestedLoopCC4PyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter a Number: ");
        int n =scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++)
                System.out.print(" ");

            for (int k = 1; k <= 2 * i -1; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}

/*
To determine the number of spaces and stars in each row, follow these steps:

Spaces:
For each row i, the number of spaces decreases as i increases.
The number of spaces is N - i.
For example, when N = 5 and i = 1, spaces = 4; when i = 2, spaces = 3, and so on.

Stars:

The number of stars in each row increases as i increases.
The number of stars is 2 * i - 1.
For example, when i = 1, stars = 1; when i = 2, stars = 3, and so on.

Example Breakdown for N = 5:
Row 1: Spaces = 4, Stars = 1 → *
Row 2: Spaces = 3, Stars = 3 → ***
Row 3: Spaces = 2, Stars = 5 → *****
Row 4: Spaces = 1, Stars = 7 → *******
Row 5: Spaces = 0, Stars = 9 → *********
*/

/*
The solution works for both even and odd values of N.
The logic for spaces and stars remains the same regardless of whether N is even or odd.

Let me explain:

For Odd N:
The pyramid will have a single star at the top and expand symmetrically downward.

Example for N = 5 (odd):
        *
        ***
        *****
        *******
        *********

For Even N:
The pyramid will still form, but the base will have an even number of stars.
Example for N = 4 (even):
        *
        ***
        *****
        *******

Key Points:
Spaces: N - i ensures the pyramid is centered.
Stars: 2 * i - 1 ensures the correct number of stars for each row.
The logic adapts automatically to both even and odd N
*/


/*
Outer Loop: Iterate over the rows (from 1 to N).
First Inner Loop: Print the spaces for alignment.
Second Inner Loop: Print the stars for the pyramid.
New Line: Move to the next line after each row

Explanation:
Outer Loop (i):

Controls the number of rows (1 to N).
For each row i, the number of spaces and stars is calculated.
First Inner Loop (j):

Print spaces to align the pyramid.
The number of spaces decreases as i increases (N - i).
Second Inner Loop (k):

Prints the stars for the pyramid.
The number of stars increases as i increases (2 * i - 1).
New Line:

After printing spaces and stars for a row, move to the next line using System.out.println().

Example for N = 3:
Row 1:
Spaces: 3 - 1 = 2 →
Stars: 2 * 1 - 1 = 1 → *
Output: *
Row 2:

Spaces: 3 - 2 = 1 →
Stars: 2 * 2 - 1 = 3 → ***
Output: ***
Row 3:

Spaces: 3 - 3 = 0 → ``
Stars: 2 * 3 - 1 = 5 → *****
Output: *****
*/
