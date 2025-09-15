public class ThreadMethod extends Thread {
    public ThreadMethod(String name) {
        super(name);
    }
    // Thread class ka overridden method. Thread class Methods.
    public void run () {
        for (int i = 1; i <= 5; i++) {
               /* {
                    String a = "";
                    for (int j = 0; j < 10000; j++)
                    {
                        a += "a";
                    }
                }*/

            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + "- count: " + i);
            try {
                Thread.sleep(100);
            }
            catch(Exception e) {

                }
            }
        }
        public static void main(String[] args) throws InterruptedException {
            ThreadMethod l = new ThreadMethod("Somesh");
            ThreadMethod m = new ThreadMethod("Diwan"); //Setting Thread Priority
            ThreadMethod h = new ThreadMethod("Unstoppable");

            l.setPriority(Thread.NORM_PRIORITY);
            m.setPriority(Thread.MIN_PRIORITY);
            h.setPriority(Thread.MAX_PRIORITY);

            l.start();
            m.start();
            h.start();
            //t1.start();
        }
}
// Start run sleep join setPriority
