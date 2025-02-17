public class MaxMinMethod
{
    public static int max(int a, int b)
    {
        if (a > b)
        {
            return a;
        } else {
            return b;
        }
    }

    public static int min(int a, int b)
    {
        if (a < b)
        {
            return a;
        } else {
            return b;
        }
    }

    public static String trimAndUpperCase(String str)
    {
        if(str != null){
            return str.trim().toUpperCase();
        }
        else{
            return "";
        }
    }

    public static void main(String[] args){
        System.out.println("Max: " + MaxMinMethod.max(4,7));  // Output: Max: 7
        System.out.println("Min: " + MaxMinMethod.min(3,9));  // Output: Min: 3
        System.out.println("Trimmed and Uppercase: " + MaxMinMethod.trimAndUpperCase("  hhhhhhh akakjskd "));  // Output: HHHHHHH AKAKJSKD
    }
}