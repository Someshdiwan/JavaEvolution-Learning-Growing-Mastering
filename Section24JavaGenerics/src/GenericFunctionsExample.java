/*
We can also write generic functions that can be called with different types of arguments based on the type of arguments passed to the generic method. The compiler handles each method.
*/

class Test4
{
    // A Generic method example
    static <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args)
    {
        // Calling generic method with Integer argument
        genericDisplay(11);

        genericDisplay("Calling generic method with String argument");

        // Calling generic method with double argument
        genericDisplay(1.0);
    }
}