class Thread2 extends Thread
{
    @Override // Thread class ka overridden method. Thread class Methods.
    public void run()
    {
        for (int i =1; i<=5; i++){
            try{
                Thread.sleep(5000);
            }
            catch(InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
        System.out.println("Thread is running.....");
    }
    public static void main(String[] args) throws InterruptedException
    {
        Thread2 t2 = new Thread2();
        t2.start();
        t2.join();
    }
}
