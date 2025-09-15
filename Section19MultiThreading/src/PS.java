class MyThread2 extends Thread {
    public void run() {
        int i=1;

        while(true) {
            System.out.println(i+"Hello");
            i++;
        }
    }
}
public class PS {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        MyThread2 t=new MyThread2();

        MyRunnable t2=new MyRunnable();

        Thread th=new Thread(t);

        th.start();

        int i=1;
        while(true) {
            System.out.println(i+"World");
        }
    }
}
