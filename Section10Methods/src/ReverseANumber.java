public class ReverseANumber {
    int reverse(int n) //For Single Number.
    {
        int rev=0;
        while (n!=0) {
            rev = rev * 10 + n % 10;
            n=n/10;
        }
        return rev;
    }
    int[] reverse(int A[]) //For Array of integers.
    {
        int B[] = new int[A.length];

        for(int i=A.length-1,j=0;i>=0;i--,j++)
            B[j]=A[i];
        return B;
    }
    public static void main(String[] args) {
        ReverseANumber obj = new ReverseANumber();
        // Reverse a single number
        int n = 569;
        int reversedNumber = obj.reverse(n);

        System.out.println("Original number: " + n);
        System.out.println("Reversed number: " + reversedNumber);

        // Reverse an array of integers
        int A[] = {2, 4, 6, 7};
        System.out.println("\nOriginal array:");
        for (int num : A) {
            System.out.print(num + " ");
        }

        int[] reversedArray = obj.reverse(A);
        System.out.println("\nReversed array:");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }
}
