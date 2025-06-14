public class Bitwise6 {
    public static void main(String[] args) {
        int x = -0b1010;
        int y;

        //y=x>>>1;
        y=x>>1;

        System.out.println(y);
    }
}

/*
x = -0b1010 (Binary Representation)

 0b1010 is 10 in decimal.
-0b1010 is -10 in decimal.

In 32-bit two’s complement, -10 is represented as: 11111111 11111111 11111111 11110110  (-10 in 32-bit)

>>> is the logical right shift operator.
Unlike >> (arithmetic right shift), >>> does not preserve the sign bit.

It fills the leftmost bit with 0 (zero-fill), regardless of whether x is positive or negative.
Effectively divides by 2 for positive numbers, but changes negative numbers significantly.
*/
