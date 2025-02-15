/*
Enum declaration can be done outside a class or inside a class but not inside a method.
 A simple enum example where enum is declared
 outside any class (Note enum keyword instead of
 class keyword)
 */
enum Color {
    RED,
    GREEN,
    BLUE;
}
public class Enum3 {
    // Driver method
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
    }
}

// enum declaration inside a class.
class Enum4 extends Enum3
{
    enum Color
    {
        RED,
        GREEN,
        BLUE;
    }
    // Driver method
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
    }
}