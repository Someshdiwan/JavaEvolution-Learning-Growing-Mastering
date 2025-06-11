public class VoidMethods
{
    //Instance variables//
    boolean value;
    String name;

    //Constructor//
    public VoidMethods (boolean inputValue, String inputName)
    {
        value = inputValue;
        name = inputName;
    }

    //Instance method//
    public void displayInfo()
    {
        System.out.println("This object has a " + value + " value, and it's name is " + name);
    }

    public static void main(String[] args)
    {
        //create the object
        VoidMethods exampleObject = new VoidMethods(true, "OK!");
        //invoke the displayInfo method
        exampleObject.displayInfo();
    }
}