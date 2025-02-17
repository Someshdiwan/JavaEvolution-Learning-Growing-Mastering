//It is used for memory management.
//It can applied on methods, blocks, and nested classes.
//main concpt behind static is that it belongs to the class rather than instances of the class.

//Static method can not use non-static data members or call non-static method directly.

//this and super cannot be used here.
//Static is Direct attached to class.

public class StaticByED {

    public static int count =0; //Count kar raha hai StaticByED
    //My aim is not access via instance, but Access via Class. Goal Class se directly access karna hai.

    public StaticByED()
    {
        count++;
    }

    private int RollNumber;

    private int Age;

    private String Name;


    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    private int getRollNumber() {
        return RollNumber;
    }

    private void setRollNumber(int rollNumber) {
        RollNumber = rollNumber;
    }

    private String getName() {
        return Name;
    }

    private void setName(String name) {
        Name = name;
    }

    public static void getCount()
    {
        System.out.println("Total conunts: " + count);
    }

    public static void main(String[] args)
    {
       /*
       Classs ka Object bana kar access kar pa raha hu.

       StaticByED ED = new StaticByED();
       ED.setAge(14);
       System.out.println(ED.Age);

       */

        StaticByED ED = new StaticByED();

        ED.setAge(12); ED.setName("Ram"); ED.setRollNumber(123);

        System.out.println(StaticByED.count);

        StaticByED.getCount();
    }
}