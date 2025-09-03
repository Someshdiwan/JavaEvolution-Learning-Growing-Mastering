public class ReturningValues {
    //Instance attributes
    int number1;
    int number2;

    //Constructor
    public ReturningValues (int value1, int value2) {
        number1 = value1;
        number2 = value2;
    }

    //Instance Methods
    public void addToNumbers(int a) {
        number1 += a;
        number2 += a;
    }

    public int getProduct() {
        int product = number1 * number2;
        return  product;
    }

    public static void main(String[] args) {
        //create the object with initial values.
        ReturningValues exampleObject = new ReturningValues(1, 2);

        //modify the values through a method.
        exampleObject.addToNumbers(3);
        System.out.println(exampleObject.number1);
        System.out.println(exampleObject.number2);

        //calculate some value through another method.
        int number3 = exampleObject.getProduct();
        System.out.println(number3);
    }
}
