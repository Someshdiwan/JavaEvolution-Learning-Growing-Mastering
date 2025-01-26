public class InsertElementInArray {
    public static void main(String[] args)
    {
        int A[] = new int[10];

        A[0]=3; A[1]=9; A[2]=7; A[3]=8; A[4]=12; A[5]=6;

        int n=6;

        for(int i=0; i<n;i++)
            System.out.print(A[i]+",");
        System.out.println("");

        int x=20;
        int index = 2;

        for(int i=n; i>index;i--)
            A[i]=A[i-1];
        A[index]=x;
        //Shifting and inserting an element.

        for(int i=0; i<n;i++)
            System.out.print(A[i]+",");
        System.out.println("");

    }
}