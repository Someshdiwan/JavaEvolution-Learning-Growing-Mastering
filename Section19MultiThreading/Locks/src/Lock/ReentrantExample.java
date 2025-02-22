import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

static class ReentrantExample {
    private final Lock lock = new ReentrantLock(); //Can enter same methods again. enter it again.
    //One lock hai.
    //Ek count maintain keya jata hai kitni baar acquire keya Guya hai.

    public void outermethod() {
        lock.lock();
        try {
            System.out.println("Outer Mehthod");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }

    //Both methods try to finish the each others its is called deadlock.
    //Outer method depends on inner method and inner method depends outer methods to get finish.

    public void innerMethod() {
        lock.lock();
        try {
            System.out.println("Inner Method");
        } finally {
            lock.unlock();
        }
    }
}

public static void main(String[] args) {
    ReentrantExample R = new ReentrantExample();
    R.outermethod();
}

//Reentrant lock:
// 1. Lock 2.Unlock 3.Try/Lock types: without time and with time. 4. DeadLock(Reentrant lock). 5.lock.Interruptibly();