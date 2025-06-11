public class ComparisonOperators
{
   public static void main(String[] args)
   {
      int number1 = 1, number2 = 2;
      boolean value1 = number1 < number2;
      System.out.println("Is number1 less than number2? " + value1);
      boolean value2 = number1 >= number2;
      System.out.println("Is number1 greater than or equal to number2? " + value2);
      boolean value3 = 2*number1 == number2;
      System.out.println("Is two times number1 equal to number2? " + value3);
      boolean value4 = !(number1 != number2);
      System.out.println("Is number1 not different from number2? " + value4);
   }
}