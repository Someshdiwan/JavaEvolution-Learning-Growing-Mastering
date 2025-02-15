@FunctionalInterface
interface MyLambda{
    public void display();
}

/*class My1 implements MyLambda
{
    public void display()
    {
        System.out.println("Hello World");
    }
}*/

public class LambdaDemo {
    public static void main(String[] args) {
       /* My1 m=new My1();
        m.display();
        */

        /*
        //Anonymous Inner Class Declare
        MyLambda m = new MyLambda() {
            @Override
            public void display() {
                System.out.println("Hello World");
            }
        };
        */

        //MyLambda Mehtod.Method it self is an object in lambda class.
        MyLambda m=
                () ->
                {
                    System.out.println("Hello world");
                };
                m.display();
    }
}