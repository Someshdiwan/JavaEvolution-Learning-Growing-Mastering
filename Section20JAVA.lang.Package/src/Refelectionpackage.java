import java.lang.reflect.*;

/**
 * 📘 GeeksforGeeks – Reflection in Java
 * <p>
 * Article: <a href="https://www.geeksforgeeks.org/reflection-in-java/">
 * https://www.geeksforgeeks.org/reflection-in-java/</a>
 */

class My {
    private int a;
    protected int b;
    public int c;
    int d;

    public My() {}

    public My(int x,int y) {}

    public void display(String s1,String s2) {}
    public int show(int x,int y) {return 0;}
}

public class Refelectionpackage {
    public static void main(String[] args) {
        Class c=My.class;
        /* Getting definition by assigning .class file.

        Or you also use, ReflectionJAVA m=new ReflectionJAVA(); Class c1=m.getClass();
        */
        System.out.println(c.getName());

        Field field[]=c.getDeclaredFields();

        Method meth[]=c.getMethods();

        for(Method m:meth)
            System.out.println(m);

        //Getting a detail of the constructor in class.

        Constructor con[] = c.getConstructors();

        for(Constructor ct:con)
            System.out.println(ct);
        /*
        O/p:
        public My()
        public My(int,int)
        */

        Parameter param[]=meth[0].getParameters();
        for(Parameter p:param) {
            System.out.println(p);
        }
    }
}

/*
1. Reflection ek a runtime mechanism hai → Jisme hum classes, methods, fields, constructors ki info access kar sakte hain.
2. Entry point: `Class` object (Class c = My.class; ya obj.getClass()).
3. `getDeclaredFields()` → sabhi fields (private + protected + default + public).
4. `getMethods()` → sirf public methods (including inherited from Object class like toString(), hashCode()).
5. `getConstructors()` → sirf public constructors deta hai.
6. `getParameters()` → ek method ke parameter list ka detail deta hai.

7. Reflection ka use:
   - Frameworks (Spring, Hibernate) → objects ko dynamically inspect aur manipulate karna.
   - Tools (JUnit, debuggers) → runtime par methods ko call karna ya inject karna.
8. Cons:
   - Slow performance (direct call se slower).
   - Security risks (private fields/methods access karne ki ability).
*/
