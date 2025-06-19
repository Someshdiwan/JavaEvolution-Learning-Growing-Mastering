public class TwoDArray {
    public static void main(String[] args) {
        int B[][] = {{1, 2, 3}, {2, 4, 6}, {1, 3, 5}};

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++)
           /*
           Gives the number of columns (using the first row's length)
           refers to the first row of the 2D array, which is `{1, 2, 3}`.
           It's a 1D array itself. `B[0]`
           So:
            - = `{1, 2, 3}` `B[0]`
            - = `3` (the number of columns in the first row) `B[0].length`

            That's why in the loop condition is used to determine how many times to iterate through each column
            - it gives us the width of the array (number of columns). `B[0].length`
            */
            {
                System.out.print(B[i][j] + " ");
            }
            System.out.println("");
        }

        int A[][] = new int[5][5];

        int c[][];
        c=new int[5][5];

        int[][]D = new int[5][5];
        int[]E[]  = new int[5][5];

        int[]M,F[];
        M=new int[5]; //1D Array.
        F=new int[5][5]; //It's Two D Array.

        int[]G, H[]; //2D Array

        int[] I,J,K,L; //All the 1 D array.

        int[][] O, N; // Both O and N are 2D arrays.

        /*Explanation:
        int[] M[]; and int[][] M; are equivalent and represent a 2D array.
                You can declare multiple variables of the same type separated by commas (,), but the semicolon (;) ends the statement.
                Key Points:
        int[] represents a 1D array.
        int[][] represents a 2D array.
                Avoid mixing, and; in a single declaration.*/
    }
}
