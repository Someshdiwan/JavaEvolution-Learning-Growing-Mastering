import java.awt.*;
import java.lang.reflect.Member;

interface Member1
{
    public void callback();
}
class store
{
    Member1 members[]=new  Member1[10];
    int count =0;

    void register(Member1 m)
    {
        members[count++]=m;
    }
    void inviteSale()
    {
        for(int i=0;i<count;i++)
            members[i].callback();
    }
}
/*
Member1 members[] = new Member1[10];
int count = 0;
This declares an array of Member1 references with a maximum size of 10.
count keeps track of how many members have been registered.
register(Member1 m)

void register(Member1 m) {
    members[count++] = m;
}

This method adds a new Member1 object (like a Customer) to the members array.
count++ ensures the next object is stored in the next available index.
Example Execution:

store s = new store();
Customer c1 = new Customer("John");
Customer c2 = new Customer("Smith");

s.register(c1); // Adds c1 to members[0]
s.register(c2); // Adds c2 to members[1]
inviteSale()


void inviteSale() {
    for (int i = 0; i < count; i++)
        members[i].callback();
}

This loops through all registered members.
Calls the callback() method on each member.
Example Execution:

s.inviteSale();

Calls:

c1.callback(); // Outputs: Ok, I will visit, John
c2.callback(); // Outputs: Ok, I will visit, Smith

Why is This Useful?
Flexible Design: The store doesn’t need to know the exact class of members[], just that they implement Member1.
Observer Pattern: The store notifies all registered members automatically.
*/
class Customer implements Member1
{
    String name;

    Customer(String n)
    {
        name=n;
    }
    public void callback()
    {
        System.out.println("Ok, I will visit,"+name);
    }
}
public class CallBackMethodIMP {
    public static void main(String[] args) {
        store s=new store();
        Customer c1=new Customer("John");
        Customer c2=new Customer("Smith");

        s.register(c1);
        s.register(c2);

        s.inviteSale();
    }
}
/*
This Java program demonstrates the callback mechanism, a common design pattern where one object calls a method on another object to notify it of an event.

Breakdown of the Code:

1. Interface `Member1` (Callback Interface)

interface Member1
{
    public void callback();
}
   ```
- This is an interface with a single method `callback()`.
- Any class that implements this interface must define the `callback()` method.

2. Class `store` (Manages Callbacks)

class store {
    Member1 members[] = new Member1[10];
    int count = 0;
   ```
           - This class holds an array of `Member1` objects (callbacks).
            - It can register `Member1` objects using `register()`.
            - It calls the `callback()` method on all registered members when a sale happens.


    void register(Member1 m) {
        members[count++] = m;
    }
   ```
           - This method registers a new `Member1` (like a customer) in the array.

   ```java
    void inviteSale() {
        for (int i = 0; i < count; i++)
            members[i].callback();
    }
   ```
- This method calls `callback()` on each registered `Member1`, notifying them about the sale.

3. Class `Customer` (Implements the Callback)

class Customer implements Member1 {
        String name;

        Customer(String n) {
            name = n;
        }

        public void callback() {
            System.out.println("Ok, I will visit, " + name);
        }
    }
   ```
 - `Customer` implements `Member1`, meaning it must define `callback()`.
 - The `callback()` method prints a message when notified.

4. Main Method (`CallBackMethodIMP`)

public class CallBackMethodIMP {
        public static void main(String[] args) {
            store s = new store();
            Customer c1 = new Customer("John");
            Customer c2 = new Customer("Smith");

            s.register(c1);
            s.register(c2);

            s.inviteSale();
        }
    }
   ```
- Creates a `store` object.
- Creates two `Customer` objects (`c1` and `c2`).
- Registers `c1` and `c2` with `store` using `register()`.
- Calls `inviteSale()`, which triggers the `callback()` method of both customers.

            ---

    Output of the Program
```
    Ok, I will visit, John
    Ok, I will visit, Smith
```
- This happens because `store` calls `callback()` on each registered customer.
            ---
Understanding the System Design (Callback Pattern)

1. Why use a callback mechanism?

- The store does not directly call `Customer` methods.
- Instead, it calls `callback()` on a `Member1` object.
- This allows decoupling – `store` does not need to know about `Customer`, just that it has a `callback()` method.

2. What is the advantage?
            - You can have different types of members, not just `Customer`, as long as they implement `Member1`.
            - The system is flexible and easily extensible.

3. Real-World Analogy:

Think of a store as a shopping mall that notifies customers about a sale:
1. Customers register to receive sale notifications.
2. When a sale happens, the store calls back (notifies) each registered customer.
3. Each customer reacts in their own way.

---

Conclusion
- This is an example of the Observer Pattern.
- The store acts as a publisher, and customers act as subscribers.
- The callback mechanism allows a loosely coupled design.
*/
