public class BooleanOperators
{
   public static void main(String[] args)
   {
      boolean statement1 = true, statement2 = false;
      System.out.print("Not true is ");
      System.out.println(!statement1);
      System.out.print("True and false is ");
      System.out.println(statement1 && statement2);
      System.out.print("True or false is ");
      System.out.println(statement1 || statement2);
      System.out.print("Not (True and not false) is ");
      System.out.println(!(statement1 && !statement2));
   }
}