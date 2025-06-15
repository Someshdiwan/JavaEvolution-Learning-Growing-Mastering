public class NestingLoopsAndConditionals {
    public static void main(String[] args) {
        System.out.println("Behold my rectangle!");
        int rows = 6, columns = 34;
        for (int x = 1; x <= rows; x++) {
            for (int y = 1; y <= columns; y++) {
                if (x == 1 || x == rows)
                    System.out.print("-");
                else if (y==1 || y==columns)
                    System.out.print("|");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
