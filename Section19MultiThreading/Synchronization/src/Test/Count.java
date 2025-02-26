package Test;

public class Count
{
    public int count = 0;

    public synchronized void increment()
    {
        //Synchronized Block: Synchronized (this){count++;}
        count++;
    }

    public int getCount()
    {
        return count;
    }
}