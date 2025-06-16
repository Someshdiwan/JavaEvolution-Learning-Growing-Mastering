class ArrayIMPCC {
    public static void main (String[] args) {
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
        for (int i = size - 1; i >= newPosition; i--) {
            array[i + 1] = array[i];
            //array insertion algorithm that shifts elements to the right to make space for a new element.
        }

        // Insert the new element at the specified position
        array[newPosition] = newElement;
        size++; // Update the size of the array

        System.out.println("Array after insertion: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

/*
Initial array:    [2, 4, 6, 8, 10]
                     ↑
                  insert 7 here (at index 2)

Step 1: i = 4    [2, 4, 6, 8, 10, 10]  // Copy 10 to position 5
Step 2: i = 3    [2, 4, 6, 8, 8, 10]   // Copy 8 to position 4
Step 3: i = 2    [2, 4, 6, 6, 8, 10]   // Copy 6 to position 3

After insertion: [2, 4, 7, 6, 8, 10]    // Place 7 at position 2
*/
