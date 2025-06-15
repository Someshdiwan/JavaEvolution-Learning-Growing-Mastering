public class CountingError {
    public static int count(String[][] things)
        /*
        static method named count that, Returns an int (the count), Takes a 2D array of strings (String[][] things) as input
        */
    {
        int count = 0; //keep track of how many strings in the array contain the letter 'a'

        //r represents the row index.
        //things.length gives the total number of rows in the 2D array.
        for (int r = 0; r < things.length; r++) {
            /*
            c is the column index.
            things[r].length gives the number of columns in the r-th row.
            It ensures we visit every element in the 2D array.
            */
            for (int c = 0; c < things[r].length; c++) {
                if (things[r][c].indexOf("a") >= 0) {
                    count++;
                }
            }
        }
        return count;
    }

        public static void main (String[]args) {
            String[][] items = {
                    {"apple", "banana", "cherry"},
                    {"dog", "cat", "rat"},
                    {"hat", "bat", "mat"}
            };
            int result = count(items);
            System.out.println("Count of strings containing 'a': " + result);
        }
}
