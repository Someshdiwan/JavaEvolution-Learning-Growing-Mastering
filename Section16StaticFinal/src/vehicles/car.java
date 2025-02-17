package vehicles;

public class car extends Vehicle
{
    // Constant for Pi, defined using final static for immutability
    public static final double PI = 3.14159;

    public int speedLimit;

    // Constructor for Car class
    public car()
    {
        speedLimit = 200;  // Initializing speedLimit
    }

    // Implementing accelerate method
    @Override
    public void accelerate()
    {
        System.out.println("Car is accelerating...");
    }

    // Implementing decelerate method
    @Override
    public void decelerate()
    {
        System.out.println("Car is decelerating...");
    }

    // This method is final, meaning it cannot be overridden in subclasses
    public final void airBags()
    {
        System.out.println("4 Air Bags");
    }
}