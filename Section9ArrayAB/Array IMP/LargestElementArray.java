import java.util.Scanner;

public class LargestElementArray
{
    public static void main(String[] args)
    {
        int A[]={3,9,7,8,12,6,15,5,4,10,1};

        int max1,max2;

        max1=max2=A[0];

        for(int i=0; i<A.length; i++)
        {
            if(A[i]>max1)
            {
                max2=max1;
                max1=A[i];
            }
            else if (A[i]>max2)
            {
                max2=A[i];
            }

            if (A.length < 2)
            {
                System.out.println("Array must have at least two elements.");
                return;
            }
        }
        System.out.println("Second Largest is "+ max2);
        System.out.println("Largest Element is "+max1);
    }
}

/*
Time Complexity
Initialization:

Assignments for max1 and max2: O(1).
Loop through the array (for loop):

The program iterates through the array exactly once.
In each iteration, it performs a constant amount of work (comparison and assignment).
Time complexity of this loop: O(n), where n is the size of the array.
Thus, the overall time complexity is O(n).

Space Complexity
The space used by the program includes:
The input array A[]: O(n), where n is the number of elements in the array.
Variables max1 and max2: O(1) (constant space).
Other local variables (like i in the loop): O(1).
The program does not use any extra data structures; it operates directly on the input array.

*/