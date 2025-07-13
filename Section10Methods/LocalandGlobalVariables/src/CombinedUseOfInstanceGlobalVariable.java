class BankAccount {
    private String accountHolder;  // Instance variable (unique per object)
    private double balance;        // Instance variable

    static double interestRate = 5.0;  // Global variable (same for all accounts)

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to calculate interest
    public void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println(accountHolder + "'s Interest Amount: $" + interest);
    }

    // Display account details
    public void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest Rate: " + interestRate + "%\n");
    }
}

public class CombinedUseOfInstanceGlobalVariable {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 10000);
        BankAccount acc2 = new BankAccount("Bob", 20000);

        acc1.display();
        acc2.display();

        acc1.calculateInterest();
        acc2.calculateInterest();

        // Changing the global variable (affects all accounts)
        BankAccount.interestRate = 6.5;
        System.out.println("\nAfter updating global interest rate:\n");

        acc1.display();
        acc2.display();

        acc1.calculateInterest();
        acc2.calculateInterest();
    }
}
