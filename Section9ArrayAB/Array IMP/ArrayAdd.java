import java.util.Scanner;

class ArrayAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];

        System.out.println("Enter array elements A:");
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Enter array elements B:");
        for (int i = 0; i < B.length; i++) {
            B[i] = sc.nextInt();
        }

        // Add arrays A and B, store a result in c.
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.println("Sum of arrays:");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
