import java.util.ArrayList;

public class WhyGenerics {
    public static void main(String[] args)
    {
        //ArrayList list =new ArrayList();

        ArrayList<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("World");
        String s = list.get(0);
        String s11 = list.get(1);

        System.out.println(s);

        //list.add(123);
        //list.add(3.14);

        //String str = list.get(0); //Cast karna padega string mai list nahi jata.
        //Parent class and child class.

        String str = (String) list.get(0);

        String integer = (String) list.get(1); //int to string can not cast.
        //Issue: Type Safety issue and Manual Casting.(Without generics) No compile time checking.
    }
}