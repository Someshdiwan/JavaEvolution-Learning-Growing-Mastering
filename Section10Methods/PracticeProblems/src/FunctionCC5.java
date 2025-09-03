public class FunctionCC5 {
    public static void main(String[] args) {
        printSquare(5);
    }

    // User-defined method to print the square of a number.
    public static void printSquare(int num) {
        int squareResult = num * num;
        System.out.println("Square of " + num + " is: " + squareResult);
    }
}

/* Printing Output from Functions:
A Method can also directly print output to the console using print statements.

However, this doesn't provide any data back to the caller in a way that can be used elsewhere in the program.
The primary purpose here is to display information, not to provide data for further processing.

Check the example above which gives the same output as the above.
*/
