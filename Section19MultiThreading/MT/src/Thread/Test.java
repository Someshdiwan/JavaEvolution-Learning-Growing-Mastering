package Thread;

public class Test {
    public static void main(String[] args) {
        //Class Ka object Test2 ka and We're running here.
        Test2 t = new Test2();

        t.start();
        /*Two Threads are working simultaneously.
        2 independent Kaam Ho rahe hai.
        Using Class extends.*/

        for(int i=0; i<100000000; i++) {
        System.out.println("Hello world");
        System.out.println(Thread.currentThread().getName());
        }
    }
}
