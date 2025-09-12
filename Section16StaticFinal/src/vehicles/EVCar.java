package vehicles;

public class EVCar extends car {
    // Attempt to override airBags() method will result in a compile-time error
    // because airBags() is final in Car class.

    // The following code would not be allowed:

    // @Override
    // public void airBags() {
    //     System.out.println("2 Air Bags");
    // }

    @Override
    public void accelerate() {
        System.out.println("EV Car is silently accelerating...");
    }

    @Override
    public void decelerate() {
        System.out.println("EV Car is decelerating...");
    }
}
