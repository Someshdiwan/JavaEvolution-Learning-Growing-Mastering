package UsingRunable;

public class Test {
    public static void main(String[] args) {
        Test2 t2 = new Test2();
        //Mandetory to create this

        //Thread ka instance create Keya hai.
        Thread t1 = new Thread(t2); //pass keya hai Instance Class ka Test2 t2.
        t1.start();


        for(; ;)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
//A Thread Object is created by passing an instances pf MyRunnable or Runnable or Implement.
//Now in our case Test2 is here.