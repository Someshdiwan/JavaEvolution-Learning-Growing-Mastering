class StringCC
{
    public static void main(String[] args)
    {
        String x = "hello";
        char[] xArray = x.toCharArray();
        xArray[0] = 'j';
        x = new String(xArray);
        System.out.println(x);
    }
}