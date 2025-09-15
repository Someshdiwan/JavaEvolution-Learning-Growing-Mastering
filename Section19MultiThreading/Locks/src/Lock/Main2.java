package Lock;

public class Main2 {
    public static void main(String[] args) {
        BankAccounts2 B = new BankAccounts2();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                B.withdraw(50);
            }
        };

        Thread t1 = new Thread(task,"Thread 1");
        Thread t2 = new Thread(task, "Thread 2");

        t1.start();
        t2.start();
    }
}
