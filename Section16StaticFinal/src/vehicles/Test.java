//Final can be Variable, methods, class.
//Constructor can't be a final.

package vehicles;

public class Test {
    public static void main(String[] args) {
        // Creating an instance of Car.
        car myCar = new car();

        System.out.println("Car Speed Limit: " + myCar.speedLimit);
        myCar.accelerate();
        myCar.decelerate();
        myCar.airBags();  // Prints "4 Air Bags".

        // Creating an instance of EVCar.
        EVCar myEVCar = new EVCar();

        myEVCar.accelerate();  // Prints "EV Car is silently accelerating..."
        myEVCar.decelerate();  // Prints "EV Car is decelerating..."
        // myEVCar.airBags();  // This would give a compile-time error as airBags() is final in Car
    }
}
