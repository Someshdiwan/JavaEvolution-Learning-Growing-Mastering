public class Bitwise5 {
    public static void main(String[] args) {
        int x = 0b1000; //x = 8.
        int y;

        y=x>>1; //right shift by one decimal, or we can say that bits.

        System.out.println(y);
    }
}

/*
It shifts the bits of x one position to the right, while preserving the sign bit (leftmost bit).

Key Points:
For positive numbers, it's equivalent to dividing by 2.
For negative numbers, it rounds down (towards negative infinity).
The leftmost bit (sign bit) remains the same, ensuring sign extension.
*/
