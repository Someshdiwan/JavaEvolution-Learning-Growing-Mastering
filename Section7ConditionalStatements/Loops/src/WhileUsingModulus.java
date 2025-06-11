public class WhileUsingModulus
{
    public static void main(String[] args)
    {
        int num = 1;
        int count = 0;
        //while number is less than, or equal to, 10
        while (num <= 10)
        {
            //if the number is divisible by 2 (i.e. even) AND divisible by 3, then...
            if (num % 2 == 0 && num % 3 == 0)
            {
                count++;
            }
            num++;
        }
    }
}
