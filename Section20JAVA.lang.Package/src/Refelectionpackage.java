//https://www.geeksforgeeks.org/reflection-in-java/

import java.lang.reflect.*;

class My
{
    private int a;
    protected int b;
    public int c;
    int d;

    public My() {}

    public My(int x,int y) {}

    public void display(String s1,String s2) {}
    public int show(int x,int y) {return 0;}

}

public class Refelectionpackage
{
    public static void main(String[] args)
    {
        Class c=My.class; //Getting defination by assign ing .class file
        /* Or you also use
        ReflectionJAVA m=new ReflectionJAVA();
        Class c1=m.getClass();
        */
        System.out.println(c.getName());

        Field field[]=c.getDeclaredFields();

        Method meth[]=c.getMethods();

        for(Method m:meth)
            System.out.println(m);

        //Getting a detail of the constructer in class.
        Constructor con[] = c.getConstructors();
        for(Constructor ct:con)
            System.out.println(ct);

        /*
        O/p:
        public My()
        public My(int,int)
        */

        Parameter param[]=meth[0].getParameters();
        for(Parameter p:param)
        {
            System.out.println(p);
        }
    }
}