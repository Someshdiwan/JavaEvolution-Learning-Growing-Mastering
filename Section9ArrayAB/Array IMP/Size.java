import java.util.Scanner;

class Size {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the size of array");
        n = sc.nextInt();

        int[] A = new int[n];
        System.out.println("Enter the elements of array");
        // Read array elements
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Even numbers in the array:");
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                System.out.println(A[i]);
            }
        }
        sc.close(); // Close the scanner when done
    }
}
