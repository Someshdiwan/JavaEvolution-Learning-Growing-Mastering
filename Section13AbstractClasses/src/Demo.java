abstract class DemoBase
{
    int x = 5;
}
class DemoB extends DemoBase
{
    int y = 7;
}
class DemoC extends DemoB
{
    double average = 0.0;
    void calcAverage()
    {
        average = (x + y) / 2.0;
        System.out.println("Average: " + average);
    }
}
class DemoD extends DemoC
{

}
class Demo
{
    public static void main(String[] args)
    {
        DemoD objD = new DemoD();
        objD.calcAverage();
    }
}