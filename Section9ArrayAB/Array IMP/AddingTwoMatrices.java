public class AddingTwoMatrices {
    public static void main(String[] args) {
        int A[][] = {{3, 5, 9}, {7, 6, 2}, {4, 3, 5}};
        int B[][] = {{1, 5, 2}, {6, 8, 4}, {3, 9, 7}};

        int C[][] = new int[3][3];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        for (int x[] : C) /*Iterates over each row (1D array) of the 2D array C*/
            {
                for (int y : x) /*Iterates over each element in the current row*/
                    {
                        System.out.print(y + " "); /*Prints the element*/
                    }
                    System.out.println("");  /*Moves to the next line after printing a row*/
            }
    }
}

/*
Explanation:

Outer Loop:
for (int x[] : C) loops through each row (x[]) in the 2D array C.
Here, x represents a 1D array (a row in the matrix).

Inner Loop:
for (int y : x) loops through each element (y) in the current row (x[]).
y represents the individual elements of the row.

Printing:

System.out.print(y + " ") prints each element (y) in the current row on the same line.
System.out.println(""); moves to a new line after finishing one row, ensuring the next row starts on a new line.
*/
