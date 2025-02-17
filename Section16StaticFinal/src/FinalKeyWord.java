public class FinalKeyWord {

    //Final class can not the override or extends

    class TestFinal
    {
        public final void show()
        {
            System.out.println("Hello");
        }
    }
    class TestFinal1 extends TestFinal
    {
        //public void show(){} Must be a static to override the method.
        //We restrict run tie polymorphism means method overriding.
    }

    //final float PI;
    //PI=3.1456F; Not allowed to initialize the variable

    final float PI;
    {
        PI=3.145F; //Allowed instance block allowed.
    }

    static final float PI1;
    static
    {
        PI1=3.1456f; //Allowed this
    }

    //Main method is static
    public static void main(String[] args)
    {
        final int x=10; //Final identifier

        final float PI; //Initialization of final
        PI=3.1425F;
        System.out.println(PI);
    }
}

/*
Summary of Key Points:

Final airBags() Method: This method in the Car class is declared final so it cannot be overridden in the EVCar class (or any other subclass). If you want subclasses to be able to override it, you need to remove the final keyword from the method.
Static Constant PI: PI is now a constant in the Car class and is declared final static (constant style).
Naming Conventions: Classes are named using proper camel case (Car instead of car).
EVCar Class: Demonstrates overriding of methods like accelerate() and decelerate(), but it cannot override airBags() due to the final modifier in the Car class.
*/