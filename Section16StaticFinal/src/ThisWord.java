class ThisWord {
    // Instance variables for the account holder's name and balance
    String accountHolderName;
    double accountBalance;

    // Parameterized constructor to initialize name and balance using 'this' keyword
    public ThisWord(String name, double balance) {
        this.accountHolderName = name;  // 'this' refers to the instance variable accountHolderName
        this.accountBalance = balance;  // 'this' refers to the instance variable accountBalance
    }

    public static void main(String[] args) {
        // Create an object of ThisWord class with a parameterized constructor
        ThisWord account = new ThisWord("Alice", 1500.0);  // Initializing with name and balance

        System.out.println("Account Holder: " + account.accountHolderName);  // Accessing the name
        System.out.println("Account Balance: " + account.accountBalance);  // Accessing the balance
    }
}
