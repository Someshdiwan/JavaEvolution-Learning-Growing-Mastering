public class ReverseCopyingArray {
    public static void main(String[] args) {
        int A[]={8,6,10,9,2,15,7,13,14,11};
        int B[]=new int[10];

        for(int i=A.length-1,j=0;i>=0;i--,j++) {
            B[j]=A[i];
        }
        for(int x:B) {
            System.out.print(x+",");
        }
    }
}

/*
1. Initialization part: `int i=A.length-1,j=0`
    - Creates two counters in one statement
    - starts from the last index of array A (A.length-1) `i`
    - starts from 0 `j`

2. **Condition part** : `i>=0`
    - Loop continues as long as is greater than or equal to 0 `i`
    - Only checks, since will naturally stay within bounds `i``j`

3. Increment/Decrement part: `i--,j++`
    - decrements by 1 in each iteration (moves backwards) `i`
    - increments by 1 in each iteration (moves forwards) `j`

4. Loop body: `B[j]=A[i]`
    - Copies element from position of array A to position of array B `i``j`

Here's how it works step by step:

Iteration 1: i=9, j=0  → B[0] = A[9]
Iteration 2: i=8, j=1  → B[1] = A[8]
Iteration 3: i=7, j=2  → B[2] = A[7]
...and so on

This is a compact way of writing two counters moving in opposite directions.
It could also be written as two separate loops or with just one counter, but this is more efficient as it does the job in a single pass.
*/
