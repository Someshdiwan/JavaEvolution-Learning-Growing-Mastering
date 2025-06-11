public class ShortcutOperators
{
   public static void main(String[] args)
   {
      int x = 1, y = 3, z = -2;
      x++; //x is incremented by 1
      System.out.println("x is now " + x);
      z--; //z is decremented by 1
      System.out.println("z is now " + z);
      y += x; //y increases by the current value of x
      System.out.println("y is now " + y);
      z *= x-y; //z gets multiplied by the difference between x and y
      System.out.println("z is finally " + z);
   }
}