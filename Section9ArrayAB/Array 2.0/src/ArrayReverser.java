/**
 * Utility class for array reversal operations.
 */
public class ArrayReverser {
    private static final String PRINT_SEPARATOR = " ";

    /**
     * Reverses the elements of an array in place.
     *
     * @param arr the array to be reversed
     * @throws IllegalArgumentException if the input array is null
     */
    public static void reverseArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    /**
     * Prints the array elements with a space separator.
     *
     * @param arr the array to print
     * @param prefix the prefix message to print before the array
     */
    private static void printArray(int[] arr, String prefix) {
        System.out.println(prefix);
        for (int num : arr) {
            System.out.print(num + PRINT_SEPARATOR);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 4, 5};
        printArray(arr, "Original Array:");
        reverseArray(arr);
        printArray(arr, "Reversed Array:");
    }
}
