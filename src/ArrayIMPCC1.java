/*
Deletion from an array
Deleting elements from a 1D array involves removing an element from a specific position within the array and then shifting the remaining elements to fill the gap.

Here's a step-by-step process for deleting elements from a 1D array:

Determine the Position: Decide which element you want to delete from the array. You need to know the index (position) of the element you want to remove.
Shift Elements: Starting from the position of the element to be deleted, move each element one position to the left until you reach the end of the array. This fills the gap left by the deleted element.
Update Array Size: If your array is dynamically allocated or you're using a mechanism that tracks the size, decrease the size of the array to reflect the new number of elements.
Task
You are given the code in the IDE.
Update the code based on the steps given above to get the necessary output!*/

public class ArrayIMPCC1{
    public static void main(String[] args) {
        int[] array = new int[100];
        array[0] = 2;
        array[1] = 4;
        array[2] = 6;
        array[3] = 8;
        array[4] = 10;
        int size = 5;

        int positionToDelete = 2;
        //index of element to delete the position

        for(int i = positionToDelete; i < size -1; i++)
        {
            array[i] = array[i+1];
        }

        size --;

        //updated array

        for (int i = 0; i < size; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}