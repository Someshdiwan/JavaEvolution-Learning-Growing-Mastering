package mypack1;

public class Demo2
{
       Demo1 d= new Demo1();
       
       public void show()
       {
              System.out.println(d.a+d.b+d.c+d.d);
              //Private Members are not accessible in the non subclass of same class also//
       }
}      