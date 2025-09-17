import java.io.*;

class WriteCustomerData implements Serializable {
    String custID;
    String name;
    String phno;

    static int count = 1;

    void Customer(String n, String p) {
        custID = "C" + count;  // Unique ID
        count++;
        name = n;
        phno = p;
    }

    public String toString() {
        return "Customer ID: " + custID + "\nName: " + name + "\nPhno: " + phno + "\n";
    }
}

public class WriteData {
    public static void main(String[] args) throws Exception {
        Customer list[] = {
                new Customer("Smith", "123456789"),
                new Customer("Johnson", "1234567"),
                new Customer("Ajay", "12345345")
        };

        FileOutputStream fos = new FileOutputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/Customer2.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(list);  // Serialize the entire array at once
        oos.close();
        fos.close();

        System.out.println("Customer data serialized successfully.");
    }
}
