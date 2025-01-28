public class MaxInArray {
    // Method to find the maximum element in the array
    static int max(int A[])
    {
        // Start with the assumption that the first element is the largest
        int max = A[0];

        // Iterate through the array
        for (int i = 1; i < A.length; i++)
        {
            // Update max if the current element is larger
            if (A[i] > max)
            {
                max = A[i];
            }
        }
        // Return the largest element
        return max;
    }
    public static void main(String[] args)
    {
        // Example array
        int[] array = {3, 5, 7, 2, 8, -1, 4, 10, 12};

        // Find and print the maximum element
        System.out.println("The maximum element in the array is: " + max(array));
    }
}
/*
Initialization: The max method initializes the max variable to the first element of the array.
Iteration: It then iterates over the rest of the array starting from index 1.
Comparison: During each iteration, it checks if the current element is greater than max. If it is, it updates the value of max.
Return: After the loop completes, the method returns the max value.
*/