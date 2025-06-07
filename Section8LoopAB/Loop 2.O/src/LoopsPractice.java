import java.util.Scanner;

class LoopsPractice
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, s, x=0, pos=0;
        System.out.println("Enter size of an array");
        n = sc.nextInt();
        int [] A = new int[n];
        System.out.println("Enter Array elements:");

        for(int i = 0; i<A.length; i++)
        {
            A[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");

        for(int i = 0; i<A.length; i++)
        {
            System.out.println(A[i]);
        }

        System.out.println("Enter element to search: ");
        s = sc.nextInt();

        for(int i = 0; i<A.length; i++)
        {
            if(A[i] == s)
            {
                x = 1;
                pos = i;
                break;
            }
        }
        if(x == 0)
        {
            System.out.println("not found");
        }
        else
        {
            System.out.println("Found at "+pos);
        }
    }
}
