package Lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccounts {
    private int Balance = 100;

    //Customized lock without Synchronized.
    //Lock lock = new interface; Interface ka obj create karenge and implementation use karna hai
    //hai lock jaiska ham object create kar rahe hai.

    //Methods Lock:
    //lock.locky()
    //lock.trylock()
    //lock.inlock()

    private final Lock lock = new ReentrantLock(); //Lock class ka object hai.
    // Reentrant Ek class hai jo lock interface ko implement kar rahi hai.

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);

        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (Balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceedfing withdrawal " + Balance);

                        Thread.sleep(3000); //Time taken to process transaction
                        Balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " Completed Withdrawl. Remaining Balances: " + Balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficiant Balance: " + Balance);
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try again later");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }

        /*if (Balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");

            try
            {
                Thread.sleep(10000);
            }
            catch (InterruptedException e)
            {

            }
        Balance -= amount;
        System.out.println(Thread.currentThread().getName() + " Completed Withdrawl. Remaining Balances: " + Balance);
    }
        else
        {
            System.out.println(Thread.currentThread().getName() + " insufficiant Balance");
        }*/
    }
}