/*Logic to Merge Lists
        Input:

        Read the sizes of List 1 (N) and List 2 (X).
        Read the elements of List 1 and List 2.

        Merge:
        Create a new list (mergedList).
        Add all elements of List 1 to mergedList.
        Add all elements of List 2 to mergedList.
        Add all elements of List 1 again to mergedList.
        Output:

        Print the elements of mergedList.

*/
import java.util.ArrayList;
import java.util.Scanner;

public class MergeTwoLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read sizes of List 1 and List 2
        int N = scanner.nextInt(); // Size of List 1
        int X = scanner.nextInt(); // Size of List 2

        // Step 2: Read List 1
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list1.add(scanner.nextInt());
        }

        // Step 3: Read List 2
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < X; i++) {
            list2.add(scanner.nextInt());
        }

        // Step 4: Merge Lists (List 1 + List 2 + List 1)
        ArrayList<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(list1); // Add List 1
        mergedList.addAll(list2); // Add List 2
        mergedList.addAll(list1); // Add List 1 again

        // Step 5: Output the merged list
        for (int num : mergedList) {
            System.out.print(num + " ");
        }
    }
}
/*
Key Steps
Input:
Use Scanner to read N, X, and the elements of both lists.
Merge:
Use addAll() to combine the lists in the required order.
Output:
Iterate through mergedList and print the elements.
This logic works for any size of N and X.
*/
