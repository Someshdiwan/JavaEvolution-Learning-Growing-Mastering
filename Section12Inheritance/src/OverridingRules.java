class SuperOverride{
    public void DisplayOverride()
    {
        System.out.println("Super Method Display.");
    }
}
class SubOverride extends SuperOverride{

    public void DisplayOverride()
    {
        System.out.println("Sub Display.");
    }
}

public class OverridingRules {
    public static void main(String[] args) {
        SuperOverride s=new SubOverride();
        s.DisplayOverride();

        SuperOverride s1=new SuperOverride();
        s1.DisplayOverride();

        SubOverride s2=new SubOverride();
        s2.DisplayOverride();

        SuperOverride s3=new SuperOverride();
        s3.DisplayOverride();

    }
}

/*
Explanation:
Method Overriding:

The method DisplayOverride() is now public in both SuperOverride and SubOverride, which allows proper method overriding.
Since the method signature remains the same, dynamic method dispatch (runtime polymorphism) occurs.

Dynamic Method Dispatch (Runtime Polymorphism):

The reference variable s is of type SuperOverride, but it is assigned an object of SubOverride (SuperOverride s = new SubOverride();).
At runtime, Java determines that the actual object is of type SubOverride, so it calls DisplayOverride() of SubOverride, not SuperOverride.

Correct Method Invocation:
s.DisplayOverride(); correctly calls the overridden method in SubOverride.
*/