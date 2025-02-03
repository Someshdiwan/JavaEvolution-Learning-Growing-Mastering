abstract class MyInnerClass
{
    abstract public void show();
}
//Write interface word instead of the abstarct keyword.

class Outer
{
    public void display() {
        MyInnerClass m = new MyInnerClass() {
            public void show() {
                System.out.println("hello");
            }
        };
        //Method and Its body in single line.


        //For interfaces we can create the reference of the interface class but not object if interface class.

        //m.show(); for the interfaces.\
    }
}

class Outer1
{
    public void display()
    {
        class Inner
        {
            public void show()
            {
                System.out.println("Hello");
            }
        }
        Inner i=new Inner();
        i.show();

        // Alternative way to instantiate and call the method in one line
        //new inner().show();
    }
}

public class LocalInnerClass
{
    public static void main(String[] args)
    {
        Outer1 o=new Outer1();
        o.display();
    }
}

/*
What is a Local Inner Class?
A Local Inner Class is a class that is defined inside a method and can only be used within that method.
It has access to all variables and members of the outer class, but it cannot be accessed outside the method in which it is defined.


Class Naming Convention:
Java convention suggests that class names should start with an uppercase letter, so inner should be Inner.
Access Modifier:
The local inner class cannot be declared as public, protected, or private, which is correct in your case.
Clarification on Instantiation:
You correctly created an instance of inner inside display().

Key Points About Local Inner Classes
✅ Defined inside a method and can only be used within that method.
✅ Cannot have access modifiers (public, private, etc.), but can be final.
✅ Can access local variables of the method, but only if they are final or effectively final (unchanged after assignment).
✅ Cannot have static members (because it's tied to an instance of the enclosing method).
*/