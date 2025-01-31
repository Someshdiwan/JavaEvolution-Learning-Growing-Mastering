public class RotateTheArray {
    public static void reverseArray(int[] arr)
    {
        int p1 = 0;
        int p2 = arr.length - 1;

        while(p1 < p2)
        {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            p1++;
            p2--;
        }
    }
}
public static void main(String[] args)
{

    int[] arr = {1, 2, 8, 4, 5};

    System.out.println("Original Array:");
    for(int num : arr)
    {
        System.out.print(num + " ");
    }

    RotateTheArray.reverseArray(arr);

    System.out.println("\nReversed Array: ");
    for(int num : arr)
    {
        System.out.print(num + " ");
    }
}