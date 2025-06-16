public class ArrayAB {
    public static void main(String[] args) {
        int A[] = new int[10];        // Creates an array of size 10 with default values (0)
        int B[] = {1,2,3,4,5};       // Creates and initializes an array with specific values
        int C[];                      // Declares array reference
        C = new int[10];             // Initializes array C with size 10
        int [] D = new int[5];       // Alternative syntax for array declaration

        B[2] = 15;                   // Changes the third element (index 2) of array B to 15

        /*for(int i=0; i<B.length; i++)
        {
            System.out.println(B[i]);
        }*/

        //Counter-controlled for loop
        for(int i=0;i<B.length; i++) {
            System.out.println(B[i]++);
        }

        for(int x:B) {
            System.out.println(x++);
        }
    }
}
