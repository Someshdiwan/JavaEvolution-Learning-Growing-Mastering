public class ObjectPassingAB3 {
    static void change(int[] A, int index, int value) {
        A[index] = value;
    }
    static void change2(int[] x, int value) {
        x[0] = value; // modify the first element.
    }
    public static void main(String[] args) {
        int[] A = {2, 4, 6, 8, 10};

        change(A, 2, 20);
        for (int num : A) {
            System.out.print(" " + num);
        }

        System.out.println("\n");

        int[] x = {10}; // wrap primitive in array
        change2(x, 20);
        System.out.println("Value of primitive " + x[0]);
    }
}
