import java.util.Scanner;

class ArraySum
{
    public static void main(String[] args)
    {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of an Array");

        n = sc.nextInt();

        int [] A = new int[n];

        System.out.println("Enter Array Elements: ");

        for(int i = 0; i<A.length; i++)
        {
            A[i] = sc.nextInt();
        }

        System.out.println("Array elements are: ");

        for(int i = 0; i<A.length; i++)
        {
            System.out.println(A[i]);
        }

        System.out.println("Sum of Array Elements are: ");

        for(int i = 0; i<A.length; i++)
        {
            sum = sum + A[i];
        }
        System.out.println(sum);
    }
}