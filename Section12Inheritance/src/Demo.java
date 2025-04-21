class DemoA
{
    int x = 5;
}
class DemoB extends DemoA
{
    int y = 7;
}
class DemoC extends DemoB
{
    double average = 0.0;
    void calcAverage()
    {
        average = (x + y) / 2.0;
        System.out.println(average);
    }
}
class DemoD extends DemoC
{
    // Additional functionality can be added in DemoD if needed
}
class DemoE
{
    public static void main(String[] args)
    {
        DemoD objD = new DemoD();
        objD.calcAverage();
    }
}
