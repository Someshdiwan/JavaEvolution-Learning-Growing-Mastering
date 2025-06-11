import java.util.Scanner;
class Array2D
{
    public static void main(String [] args)
    {
        int [][] A=new int [2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 4 elements");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array elements are");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.println(A[i][j] + " "+ A[i][j]);
            }
        System.out.println(" ");
        }
    }
}