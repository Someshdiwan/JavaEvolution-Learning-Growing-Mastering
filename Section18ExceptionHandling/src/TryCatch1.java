public class TryCatch1 {
    public static void main(String[] args) {
        try
        {
            int myInt = Integer.parseInt("Pants");
        }
        catch (Exception e)
        {
            System.out.println("He Dude, you can't make an int out off that. Stop trying to make it happens");
        }
        finally
        {
            System.out.println("Always executed in the finally  block");
        }
        System.out.println("End Here");
    }
}
