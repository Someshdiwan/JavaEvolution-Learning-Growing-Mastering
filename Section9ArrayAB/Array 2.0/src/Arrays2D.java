public class Arrays2D {
    public static void main(String[] args) {
        //Create a 2D array of Strings, with 3 rows and 4 columns
        String[][] letters = new String[3][4];

        letters[0] = new String[]{"a", "b", "c", "d", "e"};
        letters[1] = new String[]{"f", "g", "h", "i", "j"};
        letters[2] = new String[]{"k", "l", "m", "n", "o"};

        //Enhanced for loop where every iteration, row is a 1D array of Strings.
        for (String[] row: letters) {
            //Enhanced for loop where a letter is each element of the current row.
            for (String letter: row) {
                System.out.print(letter);
            }
            System.out.println();
        }

        int[][] numbers = {{1,2}, {3,4}, {5,6}, {7,8}};
        for (int y=0; y < numbers.length; y++) {
            for (int x = 0; x < numbers[0].length; x++) {
                System.out.print(numbers[y][x]);
            }
            System.out.println();
        }
    }
}
