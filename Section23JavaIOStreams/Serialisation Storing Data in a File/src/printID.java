import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable {
    String custID;
    String name;
    String phno;

    static int count = 1;

    Customer(String n, String p) {
        custID = "C" + count; // Assign unique customer ID
        count++;
        name = n;
        phno = p;
    }

    public String toString() {
        return "Customer ID: " + custID + "\nName: " + name + "\nPhno: " + phno + "\n";
    }
}

class PrintID {
    /*public static void main(String[] args) throws Exception {
        Customer list[] = {
                new Customer("Smith", "123456789"),
                new Customer("Johnson", "1234567"),
                new Customer("Ajay", "12345345")
        };

        FileOutputStream fos = new FileOutputStream("C:\\Users\\somes\\Downloads\\JAVA SE\\Section23JavaIOStreams\\Serialisation Storing Data in a File\\MyJAVA\\Customer.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeInt(list.length); // Writing array length first
        for (Customer c : list) {
            oos.writeObject(c); // Serializing each Customer object
        }
        oos.close();
        fos.close();
        System.out.println("Customer data serialized successfully.");
    }*/

    public static void main(String[] args) throws Exception {
        java.util.Scanner sc =new java.util.Scanner(System.in);

        FileInputStream fis = new FileInputStream("C:\\Users\\somes\\Downloads\\JAVA SE\\Section23JavaIOStreams\\Serialisation Storing Data in a File\\MyJAVA\\Customer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        int length = ois.readInt(); // Read-number of customers stored
        Customer[] customers = new Customer[length];

        System.out.println("Enter name of Customer: ");

        String name = sc.nextLine();
        for (int i = 0; i < length; i++) {
            customers[i] = ( Customer ) ois.readObject();
        }

        ois.close();
        fis.close();

        System.out.println("Deserialized Customer Data:");
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}