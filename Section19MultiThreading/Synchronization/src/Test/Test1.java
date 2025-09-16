package Test;

public class Test1 {
    public static void main(String[] args) {
        Count c = new Count(); //Obj Dono mai share kar Rakha hai.

        MyThread t1 = new MyThread(c);
        //Two Threads t1 and t2 and Common object and
        //common resource hai c reference hai na upper line mai.
        MyThread t2 = new MyThread(c);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (Exception e) {

        }
        System.out.println(c.getCount());
    }
}

/*
Dono threads concurrent chal rahe hai.
Ek obj ko share kar rahe hai dono threads mai.
to make sure method() ek baaar mai ek thread ek method ko access karna hoga.
Just Use synchronized keyword behind the method and here method is Increment().
*/
