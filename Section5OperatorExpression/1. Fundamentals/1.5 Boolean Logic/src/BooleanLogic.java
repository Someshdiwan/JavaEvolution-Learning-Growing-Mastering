public class BooleanLogic {
   public static void main(String[] args) {
      boolean value1, value2;
      //Two boolean variable.

      value1 = true;
      value2 = !value1;
      //Initialize the other one as NOT the first one.

      boolean result = (!value1 || value1) || (value1 && !value2);
      //(NOT value1 OR value1) OR (value1 AND NOT value2)
   }
}
