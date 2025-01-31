class Supermethod
{
    public void display()
    {
        System.out.println("Super Class Display");
    }
}

class SubMethodOverride extends SuperMethod
{
    public void display()
    {
        System.out.println("Sub class Display");
    }
}

public class MethodOverriding1
{
    public static void main(String[] args)
    {
        SuperMethod  sup = new SubMethod();
        sup.display(); //It is called Dynamic Method Dispatch.

        SuperMethod sup1 = new SuperMethod();
        sup1.display();

        SubMethodOverride s= new SubMethodOverride();
        s.display();
    }
}