public class TwoDArray2 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {2, 4, 6}, {1, 3, 5}};
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element+" ");  // Print the actual element instead of matrix.length
            }
        }
    }
}
