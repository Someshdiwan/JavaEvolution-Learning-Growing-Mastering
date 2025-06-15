public class ForEachLoop {
    public static void main(String[] args) {
        int[][] matrix =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        // Outer for-each loop iterates through rows (1D arrays)
        for (int[] row : matrix) {
            // Inner for-each loop iterates through elements in the current row
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}

/*
Use Cases of a For-Each Loop:

Accessing Elements: When you just need to access elements without worrying about their indices.

Readable Code: For-each loops reduce boilerplate code, making it more concise and easier to read.

Immutable Collections: When you don't intend to modify the collection/array.

Key Points to Remember:
Read-Only Access:

You can use the for-each loop to read the elements but cannot modify the array or collection elements directly.
Modifications should be done with a standard for loop using indices.

Works with Arrays and Collections:
For-each loops are compatible with arrays and classes that implement the Iterable interface (e.g., ArrayList, HashSet).

No Manual Indexing:
If you need indices, you'll need to use a traditional for loop instead.

The for-each loop is ideal for reading elements of arrays or collections.

However, if you need indexing or want to modify elements, you should use a traditional for loop.

Example with a 2D Array:
To use a for-each loop with a 2D array, you need to understand that:

A 2D array is an array of arrays.
The outer loop iterates through the rows (which are themselves 1D arrays).
The inner loop iterates through the elements of each row.
*/
