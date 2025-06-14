import java.util.Scanner;

public class RadixMethod {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number (using only 0s and 1s):");
        sc.useRadix(2);

        int x = sc.nextInt();
        System.out.print(x);
    }
}

/*
The line sc.useRadix(3); in your Java code sets the radix (or base) for the Scanner object sc to 3.

This means that the Scanner will interpret the input numbers as base-3 (ternary) numbers.

Here's a detailed explanation of what happens:

1. Setting the Radix: The useRadix(int radix) method configures the Scanner to interpret numerical input
according to the specified radix.In this case, radix is set to 3.

2. Reading Input: When sc.nextInt() is called, the Scanner reads the input and interprets it as a base-3 number.

3. Conversion: The Scanner then converts this base-3 number into a base-10 (decimal) integer,
which is stored in the variable x.

Let's say the input provided by the user is 102 (in base 3):

Input in Base 3: 102
Interpretation: This is interpreted as 1*3^2 + 0*3^1 + 2*3^0 = 1*9 + 0*3 + 2*1 = 9 + 0 + 2 = 11
Stored in x**: The decimal value 11 is stored in x and then printed.

Changing the Radix
If you set another number for the radix, say 8,by using `sc.useRadix(8);`, the `Scanner` will interpret the input numbers as base-8 (octal) numbers instead of base-3.

Example with Radix 8:
Let's say the input provided by the user is 17 (in base 8):

- Input in Base 8**: 17
- Interpretation**: This is interpreted as 1*8^1 + 7*8^0 = 1*8 + 7*1 = 8 + 7 = 15
- Stored in x**: The decimal value 15 is stored in x and then printed.

Further Examples
Here are a few more examples with different radices:

Radix 2 (Binary)

sc.useRadix(2);

- Input: 1011
- Interpretation: 1*2^3 + 0*2^2 + 1*2^1 + 1*2^0 = 8 + 0 + 2 + 1 = 11
- Output: 11

Radix 16 (Hexadecimal)

sc.useRadix(16);

- Input: 1A
- Interpretation: 1*16^1 + 10*16^0 = 16 + 10 = 26
- Output: 26

Summary
The useRadix(int radix) method in the Scanner class allows you to specify the base in which the numerical
input should be interpreted.

Changing the radix alters how the Scanner converts the input string into an
integer value before storing it in the variable x.
*/
