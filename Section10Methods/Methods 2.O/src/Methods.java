public class Methods {
    public static void main(String[] args) {
        int[] a = {3, 3, 3, 4, 45, 35};
        sumOfArray(a);

        String str = upperLetter("abcdefgh");
        System.out.println("Upper case letters: " + str);

        System.out.println(sum(7, 3)+" Sum of Two Numbers. ");
        System.out.println(sum(4, 3, 7)+" Sum of Three Numbers. ");

        int x = 10;
        System.out.println("Multiply By 10 is: "+multiplyBy10(10));
    }

    public static void sumOfArray(int arr[]) //printing sum of the array.
    {
        int res = 0;
        for (int i : arr) {
            res += i;
        }
        System.out.println("Sum of array: " + res);
    }

    //creating a method name upperLetter and call that method above.and print after that.
    private static String upperLetter(String str) {
        return str.trim().toUpperCase();
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int multiplyBy10(int x) {
        return x * 10;
    }
}
