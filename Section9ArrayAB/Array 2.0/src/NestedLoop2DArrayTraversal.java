class NestedLoop2DArrayTraversal {
    public static void main(String[] args) {
        int[][] dataTable = new int[3][5];  // Declare a 3x5 matrix

        // Populate the array with sequential numbers starting from 10
        int num = 10;
        for (int i = 0; i < dataTable.length; i++) {
            for (int j = 0; j < dataTable[i].length; j++) {
                dataTable[i][j] = num++;
            }
        }

        // Iterate and print each element with its position
        for (int i = 0; i < dataTable.length; i++) {
            for (int j = 0; j < dataTable[i].length; j++) {
                System.out.println("Element at [" + i + "][" + j + "] = " + dataTable[i][j]);
            }
        }
    }
}
