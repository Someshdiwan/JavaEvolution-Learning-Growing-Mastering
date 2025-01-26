public class MethodAB
{
    static int max(int x, int y) //Return type int.
    {
        if(x>y)
            return x;
        else
            return y;
    }
    public static void main(String[] args)
    {
        int a =10;
        int b= 15;
        System.out.println(max(a,b)); //Main method is static. and static method called only static methpds.

    }
}
