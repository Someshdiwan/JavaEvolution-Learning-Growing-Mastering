public class ArrayAB {
    public static void main(String[] args) {
        int A[] = new int[10];

        int B[] ={1,2,3,4,5};

        int C[];

        C=new int[10];  //Three different methods of declaring array.

        int [] D = new int[5];

        //How to access the ellements

        B[2]=15;

        /*for(int i=0; i<B.length; i++)
        {
            System.out.println(B[i]);
        }*/

        //Counter controoled for loop
        for(int i=0;i<B.length; i++)
        {
            System.out.println(B[i]++);
        }

        for(int x:B)
        {
            System.out.println(x++);
        }

    }
}