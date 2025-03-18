package ListDemo.Vector;

import java.util.Vector;

public class ThreadSafetyInVector {
    public static void main(String[] args) {

        //ArrayList<Integer> list = new ArrayList<>();
        //It is not thread safe uncomment and run

        Vector<Integer> list = new Vector<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Size of list: " + list.size()); // Output: 2000
    }
}