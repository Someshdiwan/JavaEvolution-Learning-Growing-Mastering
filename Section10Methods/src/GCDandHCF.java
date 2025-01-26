/*
The Greatest Common Divisor (GCD) is also known as the Highest Common Factor (HCF)12345.
It is the largest positive integer that divides two or more numbers without leaving a remainder.
*/

public class GCDandHCF
{

    static int gcd(int m, int n)
    {
        while(m!=n)
        {
            if(m>n)m=m-n;
            else n=n-m;
        }
        return m;
    }
    public static void main(String[] args)
    {

        System.out.println(gcd(35,56));
    }
}