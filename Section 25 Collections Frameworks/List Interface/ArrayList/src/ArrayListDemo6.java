import java.util.Arrays;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        // Binary Search On Arrays
        int a[] = {2, 4, 6, 8, 1, 3, 5};
        int b[] = {2, 4, 6, 8, 1, 3, 5, 7};

        int c[] =  Arrays.copyOf(a,a.length);

        Arrays.sort(c);
        System.out.println(Arrays.binarySearch(c,2));
    }
}
