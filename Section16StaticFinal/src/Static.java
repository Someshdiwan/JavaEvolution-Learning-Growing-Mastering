class Test
{
    static int x=10;
    int y=20;

    void show()
    {
        System.out.println(x+" "+y);
    }

    static void display()
    {
        System.out.println(x);
        //System.out.println(y);
        //Not access beacause static method only the access static members.
    }
}

public class Static {
    public static void main(String[] args) {
        Test t1= new Test();
        t1.show();

        t1.x=30;
        t1.y=50;

        Test t2= new Test();
        t2.show();
    }
}