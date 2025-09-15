package Thread;

public class Test2 extends Thread {
    @Override
    public void run() {
        for(int i=0; i<1000000; i++) {
            System.out.println("World");
        }
    }
}
