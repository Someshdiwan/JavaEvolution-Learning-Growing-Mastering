class MyData
{
    synchronized public void display(String str)

            //Entire method is synchronized
    {
        //Also allow to do this.
        synchronized (this)
        {
            for (int i = 0; i < str.length(); i++)
            {
                System.out.print(str.charAt(i));

                //Printing and sleeping and printing and sleeping.
                try{Thread.sleep(100);}catch (Exception e){}
            }
        }
    }
}

class MyThreadSys extends Thread
{
    MyData d;

    //constructor take reference of my object of data d.
    //Assign object of myData.
    public MyThreadSys(MyData d) //Takes reference of object of MyData
    {
        this.d = d;
    }

    public void run()
    {
        d.display("Hello World");
    }
}

class MyThreadSys2 extends Thread
{
        MyData d;
        //constructor take reference of my object of data d.
        //Assign Object of myData.

        public MyThreadSys2(MyData d) //Takes reference of object of MyData
        {
            this.d = d;
        }

        public void run()
        {
            d.display("Welcome All");
        }
}
public class Synchronization
{
    public static void main(String[] args)
    {
            MyData data = new MyData();

            MyThreadSys t1 = new MyThreadSys(data);

            MyThreadSys2 t2 = new MyThreadSys2(data);

            t1.start(); // Correct way to start a thread
            t2.start();
    }
}