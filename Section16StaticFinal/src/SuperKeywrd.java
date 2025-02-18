class Vehical
{
    int maxSpeed = 120;

    public void vroom()
    {
        System.out.println("Vroom Vroom");
    }
}

class Car extends Vehical
{
    /*int maxSpeed = 100;*/
    int maxSpeed = 100;
    public void displau()
    {
        System.out.println(super.maxSpeed);
    }

    //Super keyword on method
    public void vroom()
    {
        super.vroom();
    }
}

public class SuperKeywrd
{
    public static void main(String[] args)
    {
        /*
        Car c = new Car();
        System.out.println(c.maxSpeed);
        */
        Car c = new Car();
        c.displau();
        c.vroom();
    }
}