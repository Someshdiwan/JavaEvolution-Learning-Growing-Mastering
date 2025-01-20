/*
Merging 2 arrays
Merging two 1D arrays involves combining the elements of both arrays into a single array while maintaining their original order.

Here's a step-by-step process for merging two 1D arrays:

Create a New Array: Create a new array that is large enough to hold the combined elements of both arrays. The size of the new array should be the sum of the sizes of the two original arrays.
Copy Elements: Iterate through the elements of the first array and copy them to the new array. Then, iterate through the elements of the second array and copy them to the new array after the elements of the first array.
Result: The new array now contains all the elements from both original arrays, merged in the desired order.
Task
You are given a template code in the IDE.
Update the code to merge the 2 arrays based on the process defined above.*/

public class ArrayIMPCC2{
    public static void main(String[] args) {
        int firstArray[] = new int[100]; // First array

        firstArray[0] = 2;
        firstArray[1] = 4;
        firstArray[2] = 6;

        int size1 = 3;

        int secondArray[] = new int[100]; // Second array
        secondArray[0] = 8;
        secondArray[1] = 10;
        secondArray[2] = 12;
        secondArray[3] = 14;
        int size2 = 4;

        // Update the code below to solve the problem.

        int mergedSize = size1 + size2;

        int mergedArray[] = new int[mergedSize];

        for(int i = 0; i < size1; i++)
        {
            mergedArray[i] = firstArray[i];
        }

        for(int i = 0; i<size2; i++)
        {
            mergedArray[size1+i] = secondArray[i];
        }

        for(int i = 0; i < mergedSize; i++)
        {
            System.out.print(mergedArray[i] + " ");
        }
    }
}

/*
If you directly print the merged array without using a for loop, Java will print the array's memory address (hash code) instead of its actual elements. This happens because arrays in Java are objects, and the default toString() method for arrays doesn't override the Object class's toString() method.

 For example:

 System.out.println(mergedArray);
 This will output something like: [I@1b6d3586

 This is not useful for understanding the contents of the array. To print the actual elements of the array, you must use a loop or a method like Arrays.toString().

 Correct Way to Print Without a Loop
 If you want to avoid writing a for loop, you can use Arrays.toString() from the java.util.Arrays class:

 import java.util.Arrays;

 System.out.println(Arrays.toString(mergedArray));
 This will print the array in a readable format, like:

 [2, 4, 6, 8, 10, 12, 14]
 Key Takeaway
 Directly printing an array will not show its elements.
 Use Arrays.toString() for a quick and clean way to print the array without writing a loop.
*/
