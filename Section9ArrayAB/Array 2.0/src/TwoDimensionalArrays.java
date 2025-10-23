class TwoDimensionalArrays {
    public static void main(String[] args) {
        // Declare and initialize a 3x3 matrix with predefined values
        int[][] matrix = {
            {1, 2, 3},  // First row
            {4, 5, 6},  // Second row
            {7, 8, 9}   // Third row
        };

        // Print a message indicating matrix declaration
        System.out.println("Declaring a 3x3 matrix:");

        // Print the matrix in a structured format (without using loops)
        System.out.println(matrix[0][0] + " " + matrix[0][1] + " " + matrix[0][2]); // Print first row
        System.out.println(matrix[1][0] + " " + matrix[1][1] + " " + matrix[1][2]); // Print second row
        System.out.println(matrix[2][0] + " " + matrix[2][1] + " " + matrix[2][2]); // Print third row
    }
}
