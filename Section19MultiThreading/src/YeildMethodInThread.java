class MyThreadYeild extends Thread {
    public void run() {
        int count =1;

        while(true) {
            System.out.println(count++ +"My Thread");
        }
    }
}

public class YeildMethodInThread {
    public static void main(String[] args) {
        MyThreadYeild t=new MyThreadYeild();
        t.start();

        int count=1;

        while(true){
            //Main Thread and My Thread 2 threads running Simultaneously like we get in hello world in starting.
            System.out.println(count++ + "Main");

            Thread.yield(); //Gives extra time to complete the thread.
            //It gives thread to execute more time extra time.
        }
    }
}
