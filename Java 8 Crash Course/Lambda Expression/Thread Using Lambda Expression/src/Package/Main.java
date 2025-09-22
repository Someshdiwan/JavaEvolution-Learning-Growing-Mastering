package Package;

public class Main {
    public static void main(String[] args) {
        MyClass myclass = new MyClass();
        //Main thread. One thread runs here.

        //Another Thread runs here. Second Thread.
        Thread childthread = new Thread(myclass);
        childthread.run();
    }
}
