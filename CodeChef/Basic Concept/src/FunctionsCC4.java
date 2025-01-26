//Storing the returned value in a variable.
public class FunctionsCC4
{
    public static int calculateSum(int num1, int num2)
    {
        return num1 + num2;
    }
    public static void main(String[] args)
    {
        int sum = 0;
        sum = calculateSum(3, 4);
        int avg = sum / 2;
        System.out.println(avg);
    }
}