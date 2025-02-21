public class RevserseArray {
    public static void main(String[] args) {
        int[] arr={1,23,43,4,345,53,5,4};
        for(int i = arr.length-1;i>=0; i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
