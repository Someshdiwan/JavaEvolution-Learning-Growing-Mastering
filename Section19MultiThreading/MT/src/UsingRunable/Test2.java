package UsingRunable;

public class Test2 implements Runnable {
    @Override
    public void run() {
        for(; ; ) {
            System.out.println("World");
        }
    }
}
