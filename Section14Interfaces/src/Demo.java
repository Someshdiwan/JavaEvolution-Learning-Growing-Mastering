interface AverageCalculator
{
    void calcAverage();
}

class DemoA implements AverageCalculator
{
    int x = 5; //initialize the value of x is 5.

    @Override
    public void calcAverage() //Method for calculating Average.
    {
        System.out.println("Calculating average in DemoA");
    }
}

class DemoB extends DemoA
{
    int y = 7;
}

class DemoC extends DemoB
{

}
class DemoD extends DemoC implements AverageCalculator
{
    double average = 0.0;
    @Override
    public void calcAverage()
    {
        average = (x + y) / 2.0;
        System.out.println("Average: " + average);
    }
}

class Demo
{
    public static void main(String[] args)
    {
        DemoD objD = new DemoD();
        objD.calcAverage();
    }
}
/*
AverageCalculator interface with a method calcAverage().
DemoA implements it and gives a basic print message.
DemoB and DemoC extend the hierarchy (inherit x and y).
DemoD extends DemoC and overrides calcAverage() to calculate the average of x and y.
In main(), an object of DemoD is created and calcAverage() is called.
*/
