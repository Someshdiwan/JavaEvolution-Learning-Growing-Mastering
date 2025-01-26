//Left Rotation of Array.

public class RotateArrayIMP {
    public static void main(String[] args) {
        int A[]={3,9,7,8,12,6,15,5,4,10};

        for(int x:A)
            System.out.print(x+",");
        System.out.println("");

        int temp = A[0];

        for(int i=1; i<A.length; i++)
        {
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;

        for (int x:A)
            System.out.print(x+",");
        System.out.println("");
    }
}