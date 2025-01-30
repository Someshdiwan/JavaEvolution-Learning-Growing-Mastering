/*
Product: itemno, name, price, qty 4 properties here.
you should write properties method get and set method you have write down methods.
and now ypu have to write constructors.
Customer: custID, name, address, phno.
What is data type of itemNo, this is alpha numeric and this sholud be string or int. Ex: A25 , this should be string.
you also takr long data type.
price double and name is string and Quantity in shop may be short or long byte what ever you required decide data type proper.
Properties methods: you have to write get method. String getItemNo, String getName, like this...
setMethod: set method means it change the propertie of item can i have setItemNo. setItemNO(String itemNo) we can not change itemNo everytime.
setItemNo should not be allowd. it should be in constructer.
setName also not allowd.
setPrice allowd beacuse it changes frequently you write down those
setQuanttity allowd. it changes frequently.

Now Constructer, if you have construction product class it must take itemnumber. there is no non parameterized constucter.
Product(String itemNo , String name)


Class Customer: CustomerID, name, address, PhoneNumber, now decide data type, properties method and constructers.
like what we do in product class.
CustomerId: String is ok, name string , phoneNo: String because +91 we added , all thing are Strings.
Propertie methods are: all of them are get method and set method can not modified we gave at the time of registration and we cant change after that.
we change only addresss, so setAddress. setPhoneNumber.
Constructers; Customer(c.id, name) we cannot create customer id without mentioning his customerid and name. so there is no parameterized constructer here.

This is a Java program that defines two classes,
Product and Customer, and then takes input from the user to create objects of these classes and display their details.*/

import java.util.Scanner;

class product
{
    private String itemNo;
    private String name;
    private double price;
    private short qty;

    public product(String itemNo)
    {
       this.itemNo = itemNo;
    }

    public product(String itemNo, String name)
    {
        this.itemNo = itemNo;
        this.name = name;
    }
    public product(String itemNo, String name, double price, short qty)
    {
        this.itemNo=itemNo;
        this.name=name;
        setPrice(price);
        setQuantity(qty);
    }
    public String getItemNo(){return  itemNo;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public short getQuantity(){return qty;}

    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setQuantity(short qty)
    {
        this.qty=qty;
    }
}

//Now for Customer

class Customer
{
    private String custID;
    private String name;
    private String address;
    private String phno;

    public Customer(String custId, String name)
    {
        this.custID = custId;  // ✅ Corrected assignment
        this.name = name;      // ✅ Corrected assignment
        this.address = "";     // Default value (can be changed later)
        this.phno = "";        // Default value (can be changed later)
    }

    public String getCustID(){return custID;}
    public String getName(){return name;}
    public String getAddress(){return  address;}
    public String getPhno(){return phno;}

    public void setAddress(String address){
        this.address=address;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
}

public class ProductAndCostomer
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Taking product details
        System.out.println("Enter Product Item Number: ");
        String itemNo = sc.nextLine();

        System.out.println("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Product Price: ");
        double price = sc.nextDouble();

        System.out.println("Enter Product Quantity: ");
        short qty = sc.nextShort();

        // Creating Product Object
        product product = new product(itemNo, name, price, qty);

        // Taking customer details
        sc.nextLine(); // Consume the newline character

        System.out.println("Enter Customer ID: ");
        String custID = sc.nextLine();

        System.out.println("Enter Customer Name: ");
        String custName = sc.nextLine();

        System.out.println("Enter Customer Address: ");
        String address = sc.nextLine();

        System.out.println("Enter Customer Phone Number: ");
        String phno = sc.nextLine();

        // Creating Customer Object
        Customer customer = new Customer(custID, custName);
        customer.setAddress(address);
        customer.setPhno(phno);

        // Displaying Product Details
        System.out.println("\nProduct Details:");
        System.out.println("Item No: " + product.getItemNo());
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());

        // Displaying Customer Details
        System.out.println("\nCustomer Details:");
        System.out.println("Customer ID: " + customer.getCustID());
        System.out.println("Name: " + customer.getName());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Phone Number: " + customer.getPhno());

        sc.close();
    }
}

/*
Product Class
Represents a product with properties: itemNo, name, price, and qty.
Only price and qty can be modified after creation (via setter methods).

Constructors:

Product(String itemNo) → Requires an item number.
Product(String itemNo, String name) → Requires item number and name.
Product(String itemNo, String name, double price, short qty) → Full constructor.

Customer Class

Represents a customer with properties: custID, name, address, and phno.
Only address and phno can be changed after registration.

Constructors:
Customer(String custID, String name) → Requires a customer ID and name.
ProductAndCustomer (Main Class)

Uses Scanner to take user input.
Prompts the user for product details (itemNo, name, price, qty).
Prompts the user for customer details (custID, name, address, phno).
Creates instances of Product and Customer using constructor calls.
Displays the entered details.

Purpose of the Code
✅ Demonstrates encapsulation by making properties private and providing getters/setters.
✅ Shows constructors for object initialization.
✅ Implements user input handling with Scanner.
✅ Practices object-oriented programming (OOP) in Java.
*/