// Interface with the default method.
interface Vehicle {
    void start();
    // abstract method

    // Default method with implementation
    default void fuel() {
        System.out.println("Vehicle needs fuel");
    }

    // Static method also allowed in interface (Java 8+)
    static void service() {
        System.out.println("Vehicle service check");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with key ignition");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts with self start button");
    }

    // Overriding the default method (optional)
    @Override
    public void fuel() {
        System.out.println("Bike runs on petrol (default overridden)");
    }
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();  // Calls abstract method from Car
        car.fuel();   // Calls default method from Vehicle

        Vehicle bike = new Bike();
        bike.start(); // Calls abstract method from Bike
        bike.fuel();  // Calls overridden version in Bike

        // Static method called from the interface itself
        Vehicle.service();
    }
}

/*
1.	Abstract Method:
•	void start(); → must be implemented by every class.

2.	Default Method:
•	default void fuel() → already has a body.
•	Implementing classes can either use it directly OR override it.

3.	Static Method:
•	static void service() → called using the interface name (Vehicle.service()), not on objects.

4.	Classes Car & Bike:
•	Both override start() (abstract method).
•	Car uses the default fuel() directly.
•	Bike overrides fuel() to provide its own behavior.
*/
