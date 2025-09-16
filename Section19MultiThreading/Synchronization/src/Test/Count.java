package Test;

public class Count {
    public int count = 0;

    public synchronized void increment() {
        /*
        pura method synchronize nahi karna bas ek code of
        block ko synchronize karna hai. toh use below in comment.
        Synchronized Block: Synchronized (this){count++;}
        */
        count++;
    }
    public int getCount() {
        return count;
    }
}
