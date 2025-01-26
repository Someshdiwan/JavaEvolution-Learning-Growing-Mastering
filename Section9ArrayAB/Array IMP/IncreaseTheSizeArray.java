public class IncreaseTheSizeArray {
    public static void main(String[] args)
    {
            int A[]={8,6,10,9,2,9};
            System.out.println("Length of A= "+A.length);
            int B[]=new int[10];

            for(int i=0;i<A.length;i++)
            {
                B[i]=A[i];
            }

            A=B;

            System.out.println("Length of A="+A.length);
        }
    }
