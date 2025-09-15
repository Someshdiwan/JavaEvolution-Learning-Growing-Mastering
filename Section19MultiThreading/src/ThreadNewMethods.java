class MyThreadIMP extends Thread {
    public void run() {
        int count =1;

        while(true) {
            System.out.println(count++);
        }
    }
}

public class ThreadNewMethods {
    public static void main(String[] args) throws Exception {
        MyThreadIMP t=new MyThreadIMP();
        t.setDaemon(true); //Dependent thread

        t.start();
        //Main has started a thread. the main Thread doesn't have to do anything now.
        //Main is waiting for this thread to finish.

        Thread mainThread=Thread.currentThread(); //Reference of main Thread
        mainThread.join();

        //Sleep 100 sec

        //try{Thread.sleep(100);}catch (Exception e){}
    }
}
