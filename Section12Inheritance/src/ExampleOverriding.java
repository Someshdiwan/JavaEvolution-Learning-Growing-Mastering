//Car and LuxaryCar
class car
{
    public void start(){System.out.println("Car Started");}
    public void accelerate(){System.out.println("Car is Accelerated");}
    public void changegear(){System.out.println("Manually We Can Change Car Gear");}
}
class LuxaryCar extends car
{
    public void start(){System.out.println("Baap Hu Tera");}
    public void changegear(){System.out.println("Automatic Start and Change Gear");}
    public void openRoof(){System.out.println("Sun Roof is open and Fast Speed and fast moving sports car");}
}

public class ExampleOverriding
{
    public static void main(String[] args)
    {
        car c = new LuxaryCar();
        c.start();
        c.accelerate();
        c.changegear();
        //c.openroof();
    }
}

/*
Polymorphism:
The reference car c = new LuxaryCar(); demonstrates polymorphism. While c is of type car,
the overridden method in LuxaryCar is executed because the object is of type LuxaryCar.

Downcasting:
To access the openRoof() method, you need to downcast c to LuxaryCar using (LuxaryCar) c.
*/