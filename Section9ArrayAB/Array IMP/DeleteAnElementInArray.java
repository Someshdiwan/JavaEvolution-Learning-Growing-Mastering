public class DeleteAnElementInArray {
    public static void main(String[] args)
    {
        int A[] = new int[10];

        A[0] = 3; A[1] = 9; A[2] = 7; A[3] = 8; A[4] = 12; A[5] = 6;

        int n = 6;

        // Print original array
        for (int i = 0; i < n; i++)
            System.out.print(A[i] + ",");
        System.out.println("");


        int index = 2; // Index of the element to be deleted

        // Shifting elements to the left to overwrite the element at the given index
        for (int i = index; i < n - 1; i++)
        {
            A[i] = A[i + 1];
        }

        n--; // Decrement the size of the array after deletion

        // Print array after deletion
        for (int i = 0; i < n; i++)
            System.out.print(A[i] + ",");
        System.out.println("");
    }
}

/*The element at the specified index is deleted by shifting all SubSequent elements one position to the left.
The variable n is decremented to reflect the new size of the array.
The result is printed before and after deletion to compare the changes.*/