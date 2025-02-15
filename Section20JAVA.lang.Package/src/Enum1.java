enum Size
{
    SMALL{
       public String toString()
        {
            return "Pizza is small";
        }
    }, MEDIUM, LARGE, EXTRALARGE
}
public class Enum1 {
    public static void main(String[] args)
    {
        System.out.println(/*"string value of SMALL is " +*/ Size.SMALL.toString());
        System.out.println("string value of MEDIUM is " + Size.MEDIUM.name());
        System.out.println(Size.values().length);
    }
}

/* In Java, we can get the string representation of enum constants using the toString() method or the name() method.*/