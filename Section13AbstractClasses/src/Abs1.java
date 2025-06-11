abstract class Test1
{
    abstract void show();
    void display()
    {
        System.out.println("Hello Woeld!");
    }
}

class Test2 extends Test1
{
    void show()
    {
        System.out.println("Welcome");
    }
}

class Abs1
{
    public static void main(String[] args)
    {
        Test2 t = new Test2();
        t.display();
        t.show();
    }
}