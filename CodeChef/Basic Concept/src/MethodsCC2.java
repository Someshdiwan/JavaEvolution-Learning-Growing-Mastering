public class MethodsCC2
{
    public static void squareAndCube(double x)
    {
        System.out.println(x * x);
        System.out.println(x * x * x);
    }

    public static void main(String[] args)
    {
        double a = 2.999;
        double b = 3.333;
        double c = 4;

        squareAndCube(a);
        squareAndCube(b);
        squareAndCube(c);
    }
}