import java.util.Scanner;

class A2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter size of the Array");
        n = sc.nextInt();
        int [] A = new int[n];
        System.out.println("Enter n elements of");

        for(int i =0; i<A.length; i++)
        {
            A[i] = sc.nextInt();
        }

        System.out.println("Even Numbers are: ");
        for(int i = 0; i<A.length; i++)
        {
            if(A[i]%2==0)
            {
                System.out.println(A[i]);
            }
        }
    }
}
