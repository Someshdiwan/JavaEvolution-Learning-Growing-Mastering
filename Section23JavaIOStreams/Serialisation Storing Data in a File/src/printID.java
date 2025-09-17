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
    /*
    public static void main(String[] args) throws Exception {
        Customer list[] = {
                new Customer("Smith", "123456789"),
                new Customer("Johnson", "1234567"),
                new Customer("Ajay", "12345345")
        };

        FileOutputStream fos = new FileOutputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/Customer.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeInt(list.length); // Writing array length first
        for (Customer c : list) {
            oos.writeObject(c); // Serializing each Customer object
        }
        oos.close();
        fos.close();
        System.out.println("Customer data serialized successfully.");
    }
    */

    public static void main(String[] args) throws Exception {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        FileInputStream fis = new FileInputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/Customer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        int length = ois.readInt(); // Read-number of customers stored
        Customer[] customers = new Customer[length];

        System.out.println("Enter name of Customer: ");

        String name = sc.nextLine();
        for (int i = 0; i < length; i++) {
            customers[i] = (Customer) ois.readObject();
        }

        ois.close();
        fis.close();

        System.out.println("Deserialized Customer Data:");

        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}

/*
1. Serializable Interface
   - `Customer implements Serializable` → ye batata hai ki Customer objects ko
     byte-stream me convert kiya ja sakta hai (serialize) aur wapas object me laaya ja sakta hai (deserialize).
   - Agar Serializable implement nahi karte to `NotSerializableException` aata.

2. Static field ka behaviour
   - `static int count` serialise nahi hota (kyunki static class level property hoti hai).
   - Jab object wapas deserialize hota hai, uska static field fresh hota hai (default class ke sath).
   - Is case me sirf `custID`, `name`, aur `phno` serialise hote hain.

3. ObjectOutputStream (Serialization)
   - `ObjectOutputStream oos = new ObjectOutputStream(fos)`
   - `oos.writeInt(list.length)` → pehle array ka length likh diya (taaki read karte waqt pata ho kitne objects hain).
   - `oos.writeObject(c)` → har Customer object file me serialize kiya gaya.

4. ObjectInputStream (Deserialization)
   - `int length = ois.readInt()` → pehle number of customers read kiya.
   - `customers[i] = (Customer) ois.readObject()` → file se ek ek object read karke array me store kiya.
   - `readObject()` ko typecast karna padta hai.

5. toString() Override
   - `Customer` class ne `toString()` override kiya hai → isliye print karne par directly readable string aata hai:
     ```
     Customer ID: C1
     Name: Smith
     Phno: 123456789
     ```

6. File Path
   - Serialization aur Deserialization dono ek hi file path use karte hain
     (`Customer.txt` binary file hoti hai, text jaisa readable nahi dikhega).

7. Scanner ka use
   - Deserialization code me tumne `Scanner` se ek name input liya hai,
     lekin uska use filtering ke liye nahi ho raha. Agar chaho to loop me
     input name se match karke sirf wahi customer print kar sakte ho.

- `try-with-resources` use karo taaki streams automatically close ho jaye.
- `serialVersionUID` add karo class me (recommended for Serializable classes).
  ```java
  private static final long serialVersionUID = 1L;
*/
