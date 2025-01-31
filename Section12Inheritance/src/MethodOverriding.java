class SuperMethod
{
    public void display()
    {
        System.out.println("Super Class Display");
    }
}
class SubMethod extends SuperMethod
{
    @Override
    public void display()
    {
        System.out.println("Sub Class Display");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        SuperMethod sup = new SuperMethod();
        sup.display();

        SubMethod s= new SubMethod();
        s.display();

    }
}
