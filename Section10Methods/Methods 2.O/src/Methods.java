/*
Syntax

accessModifier returnType methodName(parameter)
{
    //Method Body
}
*/

public class Methods
{
    public static void main(String[] args) {
        int[] a = {3, 3, 3, 4, 45, 35};
        sumOfArray(a);

        String res = upperFun("abcdefgh");
        System.out.println(res);


        System.out.println(sum(7, 3));
        System.out.println(sum(4,3,7));

        int x =10;
        System.out.println(multiplyBy10(10));
        System.out.println(x);



    }
/*
        int a =2;
        int b =2;

        System.out.println("Sum: "+(a+b));

        int arr[] = {1, 2, 3, 4, 5};
        int res =0;

        for(int i : arr)
        {
            res += i;
        }
        System.out.println(res);
*/
    public static void sumOfArray(int arr[])
    {
        int res = 0;
        for (int i : arr) {
            res += i;
        }
        System.out.println(res);
    }

    private static String upperFun(String str)
    {
        return  str.trim().toUpperCase();
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b,int c  ){
        return a+b+c;
    }

    public static int multiplyBy10(int x){
        return x *10;
    }

}