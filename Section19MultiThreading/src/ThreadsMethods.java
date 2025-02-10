import javax.naming.Name;

/*
class MyRunThread implements Runnable
{
    public void run(){} //Dummy Method
}
*/
class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
        //setPriority(Thread.MAX_PRIORITY); //setting a priority to the thread.
    }
    public void run()
    {
        int count=1;
        //make thread sleep for while

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        while(true) {
            System.out.println(count++);
        }
    }
}

public class ThreadsMethods {
    public static void main(String[] args) throws Exception
    {
        /* Thread t=new Thread(new MyRunThread(),"My Name");*/
        //Created anonmus object of runnable.
        // without any reference we created an anonmuys object.

        MyThread t=new MyThread("My Thread 1");
        //MyThread class ka object.
        System.out.println(t.getId());

        System.out.println(t.getContextClassLoader()+"ID");

        System.out.println(t.getPriority()+ "Name");

        t.start(); //states
       /* What are the all the sates.
        System.out.println("State "+t.getState());*/

        System.out.println("State "+t.getState());

        System.out.println("Alive " +t.isAlive());
    }
}
