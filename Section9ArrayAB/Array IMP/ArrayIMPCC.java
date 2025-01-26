class ArrayIMPCC
{
    public static void main (String[] args)
    {
        int []array = new int[100];
        array[0] = 2;
        array[1] = 4;
        array[2] = 6;
        array[3] = 8;
        array[4] = 10;
        int size = 5; // Current size of the array

        int newPosition = 2; // Index where you want to insert the new element
        int newElement = 7; // Element to be inserted

        // Shift elements to make space for the new element
        for (int i = size - 1; i >= newPosition; i--)
        {
            array[i + 1] = array[i];
        }

        // Insert the new element at the specified position
        array[newPosition] = newElement;

        size++; // Update the size of the array

        // Print the updated array
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
