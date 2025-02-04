//Solve it pending
class Account {
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;

    public Account(String acc, String n, String add, String phno, String dob) {
        this.accNo = acc;
        this.name = n;
        this.address = add;
        this.phno = phno;
        this.dob = dob;
        this.balance = 0;
    }

    public String getAccNo() { return accNo; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhno() { return phno; }
    public String getDOB() { return dob; }
    public long getBalance() { return balance; }

    public void setAddress(String add) { this.address = add; }
    public void setPhno(String phno) { this.phno = phno; }
}

// SavingsAccount with deposit and withdrawal
class SavingsAccount extends Account {
    public SavingsAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }

    public void deposit(long amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposited: " + amt);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(long amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

// LoanAccount with EMI payment and repayment
class LoanAccount extends Account {
    public LoanAccount(String acc, String n, String add, String phno, String dob, long loanAmount) {
        super(acc, n, add, phno, dob);
        this.balance = loanAmount; // Initial balance is the loan amount
    }

    public void payEMI(long amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("EMI paid: " + amt);
        } else {
            System.out.println("Invalid EMI payment.");
        }
    }

    public void repay(long amt) {
        if (amt > 0) {
            balance -= amt;
            if (balance < 0) balance = 0; // Ensures no negative balance
            System.out.println("Repayment done: " + amt);
        } else {
            System.out.println("Invalid repayment amount.");
        }
    }
}

// Testing the classes in main method
public class InheritanceIMP {
    public static void main(String[] args) {
        System.out.println("=== Savings Account Transactions ===");
        SavingsAccount sa = new SavingsAccount("SA123", "Alice", "New York", "1234567890", "01-01-1990");
        sa.deposit(5000);
        sa.withdraw(2000);
        System.out.println("Current Balance: " + sa.getBalance());

        System.out.println("\n=== Loan Account Transactions ===");
        LoanAccount la = new LoanAccount("LA456", "Bob", "Los Angeles", "9876543210", "02-02-1985", 10000);
        la.payEMI(3000);
        la.repay(7000);
        System.out.println("Remaining Loan Balance: " + la.getBalance());
    }
}