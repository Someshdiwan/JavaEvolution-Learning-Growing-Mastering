public class BooleanLogic {
   public static void main(String[] args) {
      boolean value1, value2; //Declare two boolean variables.
      value1 = true; //Initialize one as true.
      value2 = !value1; //Initialize the other one as NOT the first one.
      //(NOT value1 OR value1) OR (value1 AND NOT value2)
      boolean result = (!value1 || value1) || (value1 && !value2);
   }
}
