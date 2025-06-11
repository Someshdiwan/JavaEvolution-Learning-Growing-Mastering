public class Car
{
    private String model;
    private boolean isElectric;
    private double price;

    public Car(String type, boolean runsOnBatteries, double cost)
    {
        //we assigned the values passed as arguments of the constructor as instance attributes
        model = type;
        isElectric = runsOnBatteries;
        price = cost;
    }
}