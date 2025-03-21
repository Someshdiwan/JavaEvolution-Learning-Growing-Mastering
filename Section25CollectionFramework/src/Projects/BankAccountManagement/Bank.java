/*
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Account implements Serializable {
    private static final long serialVersionUID = 1L;

    String accno;
    String name;
    double balance;

    public Account() {}

    public Account(String accno, String name, double balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account No: " + accno + "\nName: " + name + "\nBalance: " + balance + "\n";
    }
}

public class Bank {
    private static final String FILE_PATH = "C://Users//somes//Downloads//JAVA SE//Section25CollectionFramework//src//AccountsDetails.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Account> accounts = loadAccounts();

        int choice;
        do {
            displayMenu();
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createAccount(sc, accounts);
                    break;
                case 2:
                    deleteAccount(sc, accounts);
                    break;
                case 3:
                    viewAccount(sc, accounts);
                    break;
                case 4:
                    viewAllAccounts(accounts);
                    break;
                case 5:
                    saveAccounts(accounts);
                    System.out.println("Accounts saved.");
                    break;
                case 6:
                    saveAccounts(accounts);
                    System.out.println("Exiting. Accounts saved.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        sc.close();
    }

    private static void displayMenu() {
        System.out.println("Menu");
        System.out.println("1. Create Account");
        System.out.println("2. Delete Account");
        System.out.println("3. View Account");
        System.out.println("4. View All Accounts");
        System.out.println("5. Save Accounts");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static Map<String, Account> loadAccounts() {
        Map<String, Account> accounts = new HashMap<>();
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return accounts; // Return empty map if file doesn't exist
        }
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            int count = ois.readInt();
            for (int i = 0; i < count; i++) {
                Account acc = (Account) ois.readObject();
                accounts.put(acc.accno, acc);
                System.out.println(acc);
            }
        } catch (Exception e) {
            System.out.println("Error loading accounts: " + e.getMessage());
        }
        return accounts;
    }

    private static void saveAccounts(Map<String, Account> accounts) {
        try (FileOutputStream fos = new FileOutputStream(FILE_PATH);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeInt(accounts.size());
            for (Account a : accounts.values()) {
                oos.writeObject(a);
            }
        } catch (IOException e) {
            System.out.println("Error saving accounts: " + e.getMessage());
        }
    }

    private static void createAccount(Scanner sc, Map<String, Account> accounts) {
        System.out.println("Enter Details: Accno, Name, Balance");
        String accno = sc.nextLine();
        String name = sc.nextLine();
        double balance = readDouble(sc, "Please enter a valid numeric value for balance:");
        Account acc = new Account(accno, name, balance);
        accounts.put(accno, acc);
        System.out.println("Account created for " + name);
    }

    private static void deleteAccount(Scanner sc, Map<String, Account> accounts) {
        System.out.println("Enter Accno to delete:");
        String accno = sc.nextLine();
        if (accounts.remove(accno) != null) {
            System.out.println("Account " + accno + " deleted.");
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void viewAccount(Scanner sc, Map<String, Account> accounts) {
        System.out.println("Enter Accno to view:");
        String accno = sc.nextLine();
        Account acc = accounts.get(accno);
        if (acc != null) {
            System.out.println(acc);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void viewAllAccounts(Map<String, Account> accounts) {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            System.out.println("All Accounts:");
            for (Account acc : accounts.values()) {
                System.out.println(acc);
            }
        }
    }

    private static double readDouble(Scanner sc, String prompt) {
        while (!sc.hasNextDouble()) {
            System.out.println(prompt);
            sc.next(); // Discard invalid input
        }
        double value = sc.nextDouble();
        sc.nextLine(); // Consume newline
        return value;
    }
}
*/