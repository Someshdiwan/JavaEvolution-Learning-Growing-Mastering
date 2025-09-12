class BankAccountPerson {
    private String accountNumber;
    private static int count = 1; // Static counter for unique accounts

    private String generateAccountNumber() {
        return "BANK-" + count++;
    }

    public BankAccountPerson() {
        this.accountNumber = generateAccountNumber();
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

class CustomerBank {
    private String name;
    private BankAccountPerson account;

    public CustomerBank(String name) {
        this.name = name;
        this.account = new BankAccountPerson();
    }

    public void showDetails() {
        System.out.println(name + "'s Account Number: " + account.getAccountNumber());
    }
}

public class BankAccountIMP {
    public static void main(String[] args) {
        CustomerBank c1 = new CustomerBank("Alice");
        CustomerBank c2 = new CustomerBank("Bob");
        CustomerBank c3 = new CustomerBank("Charlie");

        c1.showDetails();
        c2.showDetails();
        c3.showDetails();
    }
}

/*
Key Interview Points:
Encapsulation: BankAccount hides the account number generation logic.
Static Variable Usage: Ensures unique account numbers.
Simple Object-Oriented Approach: Each Customer has a BankAccount.
*/
