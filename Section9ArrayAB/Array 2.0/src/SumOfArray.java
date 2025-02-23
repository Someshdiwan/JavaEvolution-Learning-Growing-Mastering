public class SumOfArray {
    public static void main(String[] args) {
        int[] arr={-2, 4, 55,-4,11,-55,11, -55,-11,2};
        int sum=0;

        for(int i: arr)
        {
            sum+=i;
        }
        System.out.println(sum);

        /*
        for (int i=0; i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);
        */
    }
}
