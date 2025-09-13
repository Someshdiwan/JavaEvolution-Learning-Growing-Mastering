class Vehical {
    int maxSpeed = 120;

    public void vroom() {
        System.out.println("Vroom Vroom");
    }
}

class Car2 extends Vehical {
    /*int maxSpeed = 100;*/

    int maxSpeed = 100;

    public void display() {
        System.out.println(super.maxSpeed);
    }

    //Super keyword on method
    public void vroom() {
        super.vroom();
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        /*
        Car c = new Car();
        System.out.println(c.maxSpeed);
        */
        Car2 c = new Car2();
        c.display();
        c.vroom();
    }
}
