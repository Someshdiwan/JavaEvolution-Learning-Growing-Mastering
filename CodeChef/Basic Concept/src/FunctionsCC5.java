//Specifying the return type is important.


public class FunctionsCC5 {
    public static int /*return type we can change it into any type.*/ calculateSum (int num1, int num2)
    {
        return num1 + num2;
    }
    public static void main (String[] Args){
        System.out.println(calculateSum(3, 4));
    }
}