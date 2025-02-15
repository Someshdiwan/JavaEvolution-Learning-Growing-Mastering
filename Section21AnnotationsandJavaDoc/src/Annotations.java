
/*abstract class Parent1{
    abstract public void display();
}

class Child extends Parent1
{
    public void display() //Abstract method overriding a method.
    {

    }
}*/

/*class Parent{
    public void display(){}
}
class Child extends Parent
{
    //To avoid this type of silly Mistake use Annotations.
    @Override
    public void display(){

    }
}*/



class OldClass
{
    public void display()
    {
        System.out.println("Hello");
    }
    @Deprecated
    public void show()
    {
        System.out.println("Hi");
    }
}

public class Annotations
{
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        OldClass o=new OldClass();
        o.show(); //Deprecated Method
    }
}
