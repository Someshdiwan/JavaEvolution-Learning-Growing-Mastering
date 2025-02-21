//Bundling of data and methods into a single unit.
//Class ke Andar Band Kardeya hai  Data and methods ko.
//Single Unit Mai Sab Band keya hai.
//Bundle kar ke data hide kar raha hai Private use karke.

public class Encapsulation
{
        private String Color;
        private String brand;
        private String Model;
        private String CountryOrigin;
        //Sab Private to set kaise kare Getters and setters method se
        private int year;
        private int speed;

        //Method hai. Speed ko increment kar raha hai.
        public void accelerate(int increment)
        {
            speed += increment;
        }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public String getCountryOrigin() {
        return CountryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        CountryOrigin = countryOrigin;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //Behavior hai toh method mai likh te hai
        public void brak(int decrement)
        {
            speed -= decrement;
            if(speed<0)
            {
                speed=0;
            }
        }
        public static void main(String[] args) {
            ClassBluePrint car = new ClassBluePrint();

        }
}