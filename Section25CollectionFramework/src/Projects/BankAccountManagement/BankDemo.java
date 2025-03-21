package BankAccountManagement;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

class Account implements Serializable {
    String accno;
    String name;
    double balance;

    Account() {}
    //Constructor.

    Account(String a, String n, double b)
    {
        accno = a;
        name = n;
        balance = b;
    }

    @Override
    public String toString() {
        return "Account No: " + accno + "\nName: " + name + "\nBalance: " + balance + "\n";
    }
}

public class BankDemo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Account acc = null;

        HashMap<String, Account> hm = new HashMap<>();

        // Try reading previously saved accounts from file
        try {
            FileInputStream fis = new FileInputStream("C://Users//somes//Downloads//JAVA SE//Section25CollectionFramework//src//BankAccountManagement//AccountsDetails.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int count = ois.readInt();
            for (int i = 0; i < count; i++) {
                acc = (Account) ois.readObject();
                System.out.println(acc);
                hm.put(acc.accno, acc);
            }
            ois.close();
            fis.close();
        } catch (Exception e) {
            // File not found or error reading file, no accounts loaded
        }

        // Open the file for saving account details
        FileOutputStream fos = new FileOutputStream("C://Users//somes//Downloads//JAVA SE//Section25CollectionFramework//src//BankAccountManagement//AccountsDetails.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        System.out.println("Menu");
        int choice;
        String accno, name;
        double balance;

        do {
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. View Account");
            System.out.println("4. View All Accounts");
            System.out.println("5. Save Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.println("Enter Details: Accno, Name, Balance");
                    accno = sc.nextLine();
                    name = sc.nextLine();

                    // Validate balance input
                    while (!sc.hasNextDouble()) {
                        System.out.println("Please enter a valid numeric value for balance:");
                        sc.next();  // Discard invalid input
                    }
                    balance = sc.nextDouble();
                    sc.nextLine();  // Consume newline after reading double

                    acc = new Account(accno, name, balance);
                    hm.put(accno, acc);
                    System.out.println("Account created for " + name);
                    break;
                case 2:
                    System.out.println("Enter Accno to delete:");
                    accno = sc.nextLine();
                    if (hm.containsKey(accno)) {
                        hm.remove(accno);
                        System.out.println("Account " + accno + " deleted.");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.println("Enter Accno to view:");
                    accno = sc.nextLine();
                    acc = hm.get(accno);
                    if (acc != null) {
                        System.out.println(acc);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.println("All Accounts:");
                    for (Account a : hm.values())
                        System.out.println(a);
                    break;
                case 5:
                    // Save accounts to file
                    oos.writeInt(hm.size());
                    for (Account a : hm.values())
                        oos.writeObject(a);
                    System.out.println("Accounts saved.");
                    break;
                case 6:
                    // Save accounts before exiting
                    oos.writeInt(hm.size());
                    for (Account a : hm.values())
                        oos.writeObject(a);
                    System.out.println("Exiting. Accounts saved.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        oos.flush();
        oos.close();
        fos.close();
        sc.close();
    }
}