import java.util.Scanner;

class TwoDArrayPractice {
    public static void main(String[] args) {
        int [][] A = new int [2][2];
        //Declaring a 2x2 2D Array.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements: ");

        for(int i = 0; i<2; i++) {
            for(int j = 0; j<2; j++) {
                A[i][j] = sc.nextInt();
            }
        } 

        System.out.println("Array elements are: ");
        for(int i = 0; i<2; i++) {
            for (int j = 0; j<2; j++) {
                System.out.print(A[i][j]+" ");
            }
        }
        System.out.println("");
    }
}
