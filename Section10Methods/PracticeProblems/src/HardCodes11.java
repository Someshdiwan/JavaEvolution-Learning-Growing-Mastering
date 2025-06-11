/*
Can you write a Java class from scratch that demonstrates method overloading for an add() method?

The class should include:

A method add() with no parameters that adds two hardcoded numbers and prints the result.
A method add(int x, int y) that returns the sum of two integers.
A method add(int x, int y, int z) that prints the sum of three integers.
A main method where you create an object of the class and call all three overloaded methods with sample inputs.
Bonus: Explain how Java determines which overloaded method to call.
*/

class HardCodes11
{
    void add() //No Parameters.
    {
        int a, b, c;
        a=3;
        b=5;
        c=a+b;
        System.out.println(c);
    }

    int add(int x, int y) //Two Parameters.
    {
        int z;
        z=x+y;
        return z;
    }

    void add(int x, int y, int z) //Three Parameters.
    {
        int m = x+y+z;
        System.out.println(m);
    }

    public static void main(String[] args) {
        HardCodes11 obj = new HardCodes11();

        obj.add();
        int num;

        obj.add(12,45,67);
        num = obj.add(100,45);

        System.out.println(num);
    }
}
