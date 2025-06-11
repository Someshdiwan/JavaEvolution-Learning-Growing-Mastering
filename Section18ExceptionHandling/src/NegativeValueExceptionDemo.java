class NegativeValueExceptionDemo
{
    public static void main (String[] args)
    {
        try {
            int length = -5;
            int width = 3;

            // Call the static method directly using the class name
            int area = Rectangle.calculateArea(length, width);
            System.out.println("Area: " + area);
        }
        catch (NegativeValueException e) {
            System.out.println(e.getMessage());
        }
    }
}
