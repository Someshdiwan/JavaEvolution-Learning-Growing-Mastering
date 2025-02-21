public class MyThread extends Thread {
    @Override
    public void start()
    {
        System.out.println("Running");
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }

    //Checking the states of the Thread.
    //New, RUNNABLE, BLOCKED, WAITING....
    public static void main(String[] args) throws InterruptedException //main thread
    {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState());
        t1.start();

        System.out.println(t1.getState());
        //System.out.println(Thread.currentThread().getState());

        Thread.sleep(100);
        System.out.println(t1.getState());

        t1.join();
        System.out.println(t1.getState());
    }
}