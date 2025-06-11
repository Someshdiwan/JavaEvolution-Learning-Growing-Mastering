//Addition of two numbers

public class  MethodOverloading
{
    void add(int a, int b)
    {
        int result = a + b;
        System.out.println(result);
    }
    void add(double a, double b)
    {
        double result = a + b;
        System.out.println(result);
    }
    public static void main(String[] args)
    {
        MethodOverloading obj = new MethodOverloading();
        obj.add(5, 7);      // Calls the method with int parameters
        obj.add(5.5, 7.5);  // Calls the method with double parameters
    }
}
