public class ClassBluePrint
{
    String Color;
    String brand;
    String Model;
    String CountryOrigin;

    int year;
    int speed;

    //Method hai. Speed ko increment kar raha hai.
    public void accelerate(int increment)
    {
        speed += increment;
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

    @Override
    public String toString()
    {
        return
                "Car Properties:\n" +
                "Brand: " + brand + "\n" +
                "Model: " + Model + "\n" +
                "Color: " + Color + "\n" +
                "Year: " + year + "\n" +
                "Country of Origin: " + CountryOrigin + "\n" +
                "Speed Km/Hrs: " + speed;
    }

    public static void main(String[] args) {
        ClassBluePrint car = new ClassBluePrint();
        car.speed = 220;
        car.brand = "TATA";
        car.Color = "Black";
        car.year = 2025;
        car.Model = "EV";
        car.CountryOrigin = "INDIA";
        car.accelerate(100);
        System.out.println(car);
        System.out.println("Maximum Speed Limit");
    }
}