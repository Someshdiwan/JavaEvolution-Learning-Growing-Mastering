class Super {
    public void meth1() {
        System.out.println("Super Meth1");
    }

    public void meth2() {
        System.out.println("Super Meth2");
    }
}

class Sub extends Super {
    @Override
    public void meth2() {
        System.err.println("Sub Meth2");
    }

    public void meth3() {
        System.out.println("Sub Meth3");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Super sup=new Sub();

        sup.meth1();
        sup.meth2();
        /*sup.meth3();*/

        /*
        Sub sub1=new Sub();
        sub1.meth1();
        sub1.meth2();
        sub1.meth3();
        */
    }
}

/*
The line Sub sub1 = new Super(); attempts to assign an instance of Supper to a reference variable of type Sub.

This is not allowed because Supper is the parent class of Sub, but Sub is the subclass of Supper.

In other words, a Super object cannot be assigned to a Subreference, as it may not have all the methods or behavior that
Sub has.

The JVM does not know how to handle this assignment safely, so this will not compile.

Key Takeaway:
You cannot assign an instance of the superclass (Super) to a reference of the subclass (Sub).
You can assign an instance of the subclass (Sub) to a reference of the superclass (Super) because of upcasting (polymorphism).
However, you cannot do the reverse (Super to Sub), as this would cause a down casting error unless explicitly cast with proper checks.


the object sup is of type Super, but it refers to an instance of the Subclass.
This is an example of dynamic method dispatch (or runtime polymorphism),
where the actual method invoked depends on the object's actual type, not the reference type.

Here's what's happening in your code:
        sup.meth1();

Since sup is of type Super, the method meth1() is directly called from the Super class.

So, it prints "Super Meth1".
        sup.meth2();
Although the reference type is Super, the actual object is of type Sub.

Java looks at the actual type of the object at runtime (which is Sub),
and invokes the overridden version of meth2() from the Sub class.

Thus, it prints "Sub Meth2".
        sup.meth3();
Even though sup refers to an object of type Sub, the reference type is still Supper.

The method meth3() is defined only in the Subclass and not in the Super class. Since Supper doesn't have a method meth3(),
the compiler will give an error when trying to compile the code.

Why does sup.meth3(); give an error?
The reason for the error is that the reference variable sup is of type Super, and the Super class does not define the meth3() method.

Therefore, the compiler cannot resolve meth3() for the sup reference,
even though the actual object is of type Sub which has the meth3() method.

sub1.meth1() calls the method from the superclass Supper because it is inherited.
sub1.meth2() calls the overridden method from the subclass Subdue to dynamic method dispatch.
sub1.meth3() calls the method from Sub, as it is defined in that class.
*/
