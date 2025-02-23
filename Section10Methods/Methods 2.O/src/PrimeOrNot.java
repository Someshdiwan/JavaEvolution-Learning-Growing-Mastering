public class PrimeOrNot {
    public static void main(String[] args)
    {
        System.out.println(isPrime(13));
        System.out.println(isPrime(91));
        System.out.println(isPrime(100));
    }

    public static boolean isPrime(int x)
    {
        //13 --> 1,2,3,4,5,6,7,8,9,10,11,12,13
        int res = 0;
        for (int i = 1; i < x / 2; i++)
        {
            if (x % i == 0)
            {
                res++;
            }
        }
        return res == 1;
    }
}