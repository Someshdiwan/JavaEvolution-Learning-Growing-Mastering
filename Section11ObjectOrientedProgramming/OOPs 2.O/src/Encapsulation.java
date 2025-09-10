/*Bundling of data and methods into a single unit.
Class ke Andar Band Kardeya hai Data and methods ko.
Single Unit Mai Sab Band keya hai.
Bundle kar ke data hide kar raha hai Private use karke.*/

public class Encapsulation {
    // Private attributes
    private String color;
    private String brand;
    private String model;
    private String countryOrigin;
    private int year;
    private int speed;

    // Behavior methods
    public void accelerate(int increment) {
        speed += increment;
    }

    public void brake(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
    }

    // Getters and setters
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }
    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Main method to test encapsulation
    public static void main(String[] args) {
        Encapsulation car = new Encapsulation();

        // Set values using setters.
        car.setBrand("Tesla");
        car.setModel("Model S");
        car.setColor("Red");
        car.setCountryOrigin("USA");
        car.setYear(2023);
        car.setSpeed(0);

        // Use behavior methods
        car.accelerate(50);
        car.brake(20);

        // Access values using getters.
        System.out.println("Car Details:");
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor());
        System.out.println("Country of Origin: " + car.getCountryOrigin());
        System.out.println("Year: " + car.getYear());
        System.out.println("Speed: " + car.getSpeed() + " km/h");
    }
}
