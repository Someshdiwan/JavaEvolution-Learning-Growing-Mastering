class SharedObject {
    /*
    volatile keyword ensures ki "flag" variable ka latest value
    hamesha main memory se read/write hoga.
    Agar volatile remove karoge -> reader thread apne CPU cache me purana value dekh sakta hai,
    aur infinite loop me atak sakta hai.
    */
    private volatile boolean flag = false;

    public void setFlagTrue() {
        // Writer thread 3 sec delay ke baad isko true set karega
        System.out.println("Writer thread made the flag true.");
        flag = true;  // main memory update hoga (volatile ki wajah se)
    }

    public void printFlagTrue() {
        /*
        Reader thread yaha busy-wait loop karega
        Agar volatile nahi hota, to yeh thread apne local CPU cache me "false" hi dekhta rahega,
        aur kabhi bhi loop se bahar nahi nikalta.
        */
        while (!flag) {
            // do nothing (spin-wait)
        }
        // Jab writer thread ne flag true kar diya,
        // volatile ensure karega ki reader ko immediately latest value dikh jaye.
        System.out.println("Flag is true !");
    }
}

public class VolatileExample {
    public static void main(String[] args) {
        SharedObject obj1 = new SharedObject();

        // Writer thread: 3 seconds ke baad flag = true karega.
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            obj1.setFlagTrue();
        });

        // Reader thread: flag ke true hone ka wait karega.
        Thread readerThread = new Thread(() -> obj1.printFlagTrue());

        writerThread.start();
        readerThread.start();
    }
}

/*
Detailed Explanation:

1. Har thread ke paas apna ek CPU cache hota hai.
   By default, variables main memory se copy hoke thread ke cache me stored hote hain.

2. Agar "volatile" keyword nahi hai:
   - Writer thread flag = true karega, but yeh change sirf apne cache me dikh sakta hai.
   - Reader thread apne cache se flag padhta rahega (jisme abhi bhi false hai).
   - Result: Reader thread infinite loop me fas sakta hai (kyunki usko kabhi true nahi dikhega).

3. Agar "volatile" keyword lagaya hai:
   - Har read/write directly main memory se hota hai (no caching for that variable).
   - Writer thread ka change (flag = true) immediately main memory me reflect hoga.
   - Reader thread ko turant updated value milegi, aur wo loop se bahar nikal aayega.

Use Case:
Volatile tab use hota hai jab ek thread variable update karta hai aur doosre threads uska updated value read karte hain,
aur apko visibility guarantee chahiye without using heavy synchronization (locks).
*/
