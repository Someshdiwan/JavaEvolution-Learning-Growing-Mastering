public class ArrayRotator {
    private static final String DELIMITER = ", ";

    public static void main(String[] args) {
        int[] numbers = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};

        printArray(numbers);
        rotateArrayLeft(numbers);
        printArray(numbers);
    }

    public static void rotateArrayLeft(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        array[array.length - 1] = temp;
    }

    private static void printArray(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("[]");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(DELIMITER);
            }
        }
        System.out.println();
    }
}
