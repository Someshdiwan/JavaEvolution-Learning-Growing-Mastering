public class SumElementsVarargs
{
    // Method to sum elements using varargs
    int sum(int... A)

    {
        int total = 0; // Initialize total sum
        for (int i = 0; i < A.length; i++)
        {
            total += A[i]; // Add each element to total
        }
        return total; // Return the total sum
    }

    public static void main(String[] args)
    {
        SumElementsVarargs obj = new SumElementsVarargs();

        // Example usage
        int result = obj.sum(1, 2, 3, 4, 5); // Passing multiple integers
        System.out.println("Sum: " + result); // Should print "Sum: 15"
    }
}