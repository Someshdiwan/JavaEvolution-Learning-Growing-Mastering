public class PrivateConstructor
{
    //Our aim is to create only one object of our class Private Constructor

    private static PrivateConstructor School; //Vaiable leya hai
    //Instance create keya hai.


    //Private constructor create keya hai toh object create kar nahi sakte.
    private PrivateConstructor(){

    }

    //Method....Instance return karega
    public static PrivateConstructor getInstance()
    {
        if(School == null)
        {
            School = new PrivateConstructor();
        }
        return School;
    }

    public static void main(String[] args) {
        PrivateConstructor.getInstance();
        PrivateConstructor.getInstance();
        PrivateConstructor.getInstance();
        PrivateConstructor.getInstance();
        PrivateConstructor.getInstance();
        PrivateConstructor.getInstance();
        PrivateConstructor.getInstance();
        //Isko Bolte hai SingleTone Pattern, Ek hai object Hoga create Ek Class ka
        //Ye Hamne Restrication Rakh Deya hai
    }
}