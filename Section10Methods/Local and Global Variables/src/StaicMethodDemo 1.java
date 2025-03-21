class Mobile1{
    String brand;
    int price;
    String network;
    //	String name;
    static String name;

    public void show() {
        System.out.println(brand+" : "+price+" : "+name);
    }

    public static void show1(Mobile1 obj)
    {
//		System.out.println("in static method");
        System.out.println(obj.brand+" : "+ obj.price +" : "+obj.name);
    }
}

public class StaicMethodDemo {
    public static void main(String[] args)
    {
        Mobile1 obj1=new Mobile1();
        obj1.brand="Apple";
        obj1.price=1500;
        //obj1.name="SmartPhone";
        Mobile1.name="SmartPhone";

        Mobile1 obj2=new Mobile1();
        obj2.brand="Samsung";
        obj2.price=1700;
        //obj2.name="SmartPhone";
        Mobile1.name="SmartPhone";

        //obj1.name="Phone";
        Mobile1.name="SmartPhone";

        obj1.show();
        obj2.show();

        Mobile1.show1(obj1);

        //System.out.println(obj1.brand);
    }
}