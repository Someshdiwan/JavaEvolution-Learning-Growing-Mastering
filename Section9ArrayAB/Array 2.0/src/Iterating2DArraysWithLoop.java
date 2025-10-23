class Iterating2DArraysWithLoop {
    public static void main(String[] args) {
        // Define a 3x3 matrix with predefined values
        int[][] matrix = {
            {10, 20, 30}, // Initialize row 1 of the matrix
            {40, 50, 60}, // Initialize row 2 of the matrix
            {70, 80, 90}  // Initialize row 3 of the matrix
        };

        // Print a header to indicate the start of matrix iteration
        System.out.println("Iterating over a 3x3 matrix:");
        for (int i = 0; i < matrix.length; i++) { // Loop over each row of the matrix
            System.out.print("Row " + (i + 1) + ": "); // Print the row number
            for (int j = 0; j < matrix[i].length; j++) { // Loop over each column in the current row
                System.out.print(matrix[i][j] + " "); // Print each element in the row followed by a space
            }
            System.out.println(); // Move to the next line after printing all columns in a row
        }
    }
}
