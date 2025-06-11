public class StaticAttributes
{
    //Static attributes//
    public static String word = "ABC"; //word is initially "ABC"

    //Instance attributes//
    public int number;

    //Constructor//
    public StaticAttributes(String a, int b)
    {
        word = a;
        number = b;
    }

    //Instance method//
    public void displayInfo()
    {
        System.out.println("Word is " + word + ", number is " + number);
    }

    //Static method//
    public static void changeWord (String newWord)
    {
        word = newWord;
    }

    public static void main(String[] args)
    {
        //we don't need to create an object to look up the value of a static variable, the class itself can be used
        System.out.println(StaticAttributes.word);

        //create the first object
        StaticAttributes object1 = new StaticAttributes("DEF", 2);
        object1.displayInfo();

        //create a second object
        StaticAttributes object2 = new StaticAttributes("GHI", 4);
        object2.displayInfo();

        //notice object1 has been modified!
        object1.displayInfo();

        //now change the static variable
        changeWord("JKL");

        //the objects have been modified once again!
        object1.displayInfo();
        object2.displayInfo();
    }
}
