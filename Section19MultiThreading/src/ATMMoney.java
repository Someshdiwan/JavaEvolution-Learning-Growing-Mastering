class ATM {
    synchronized public void checkBalance(String name) {
        System.out.println(name+" Checking ");

        try{Thread.sleep(1000);}catch (Exception e){}

        System.out.println("Balance is: ");
    }

    synchronized public void withdraw(String name, int amount) {
        System.out.println(name+" withdrawing ");

        try{Thread.sleep(1000);}catch (Exception e){}

        System.out.println(amount);
    }
}

class Customer extends Thread {
    String name;
    int amount;

    ATM atm; //Reference to the ATM.
    Customer(String n, ATM a, int amt) //parameterized constructor and properties are initialized.
    {
        name=n;
        atm=a;
        amount=amt;
    }

    //Method call.
    public void useATM() {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }

    public void run() //Must override to achieve MultiThreading.
    {
        useATM();
    }
}

public class ATMMoney {
    public static void main(String[] args) {
        ATM atm = new ATM();

        Customer c1=new Customer("Smith", atm,100);
        Customer c2= new Customer("John",atm,200);

        c1.start();
        c2.start();
    }
}
