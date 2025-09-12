import java.util.Date;

class BankAccount {
    private String accountNumber;
    private double balance;
    private static int count = 1;  // Static counter for unique account numbers.

    private String generateAccountNumber() {
        Date d = new Date();
        return "BANK-" + (d.getYear() + 1900) + "-" + count++;
    }

    public BankAccount() {
        this.accountNumber = generateAccountNumber();
        this.balance = 0.0; // Default balance.
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from " + accountNumber);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}

class Customer {
    private String name;
    private BankAccount account;

    public Customer(String name) {
        this.name = name;
        this.account = new BankAccount(); // Assigns a new account upon customer creation
    }

    public String getName() {
        return name;
    }

    public BankAccount getAccount() {
        return account;
    }
}

public class BankAccountAutomaticStatic {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");
        Customer c3 = new Customer("Charlie");

        System.out.println(c1.getName() + "'s Account Number: " + c1.getAccount().getAccountNumber());
        System.out.println(c2.getName() + "'s Account Number: " + c2.getAccount().getAccountNumber());
        System.out.println(c3.getName() + "'s Account Number: " + c3.getAccount().getAccountNumber());

        c1.getAccount().deposit(1000);
        c2.getAccount().deposit(500);
        c1.getAccount().withdraw(300);
        c2.getAccount().withdraw(700);  // Should show insufficient funds
    }
}

/*
Features:
Customer Class: Holds details like customer name and associated account.
BankAccount Class: Generates unique account numbers using a static counter.
Automatic Account Number Assignment: Uses a static counter with a timestamp-based prefix.
*/
