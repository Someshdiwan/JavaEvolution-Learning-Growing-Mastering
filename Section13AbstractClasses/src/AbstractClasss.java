import java.awt.event.TextEvent;

abstract class SuperAbstract
{
    public SuperAbstract() {System.out.println("Super Constructor");} //Constructor
    public void meth1()
    {
        System.out.println("Meth1 of Super");
    }
    abstract public void meth2();
}

class SubAbstract extends SuperAbstract
{
    @Override
    public void meth2()
    {
        System.out.println("Sub meth2");
    }
}
public class AbstractClasss
{
    public static void main(String[] args)
    {
        /*we can not creae obj of abstract class*/
        SuperAbstract s=new SubAbstract();
        s.meth1();
        s.meth2();
    }
}