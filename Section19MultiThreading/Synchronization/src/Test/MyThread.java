package Test;

public class MyThread extends Thread
{
    private Count count;

    public MyThread(Count count) //Constructor
    {
        this.count = count;
    }

    @Override
    public void run()
    {
        for(int i=0; i<1000;i++)
        {
            count.increment();
        }
    }
}
