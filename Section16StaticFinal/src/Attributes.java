public class Attributes {
    private int number; //every 'Attributes' object has a number
    private String word; //every 'Attributes' object has a word

    public static void main(String[] args) {
        //creating an object.
        Attributes object1 = new Attributes();

        //assigning values to its attributes.
        object1.number = 9;
        object1.word = "Grade";

        //creating a different object with different attributes.
        Attributes object2 = new Attributes();
        object2.number = 2022;
        object2.word = "Java";

        //accessing values of attributes of objects.
        System.out.println("object1 has a number " + object1.number);
        System.out.println("object2 has a word " + object2.word);
    }
}
