interface MyConstructor
{
    public void display(String str);  //You can assign the more than one Parameters.
}
public class ConstructerAsMethodReference {
    public ConstructerAsMethodReference(String s)
    {
        System.out.println(s.toUpperCase());
    }

    public static void main(String[] args)
    {
        MyConstructor m1=ConstructerAsMethodReference::new;
        //Constructor new along with the class name
        m1.display("print the upper case letters");
    }
}