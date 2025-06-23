public class RotateTheArrayTwoPointer {
    public static void ReverseTheArray(int[] arr) {
        int p1 = 0;
        int p2 = arr.length - 1;

        while(p1 < p2) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
    }
}
