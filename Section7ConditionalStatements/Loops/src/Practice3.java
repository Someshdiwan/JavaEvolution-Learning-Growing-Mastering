public class Practice3
{
    public static void main(String[] args)
    {
        double temperature; //in Celsius degrees
        double humidity; //as a percentage
        boolean smartMode;

      /*
      The previous variables have been assigned hidden values here.
      */

        if (smartMode) //if smartMode is true, then...
        {
            if (humidity > 0.7) //if humidity is greater than 0.7 then...
                System.out.println("Dehumidifier activated.");
            else //else, if the humidity is lower, then...
                System.out.println("Smart save mode on. Only fan activated.");
        }
        else //else, if smartMode is false, then...
        {
            if (humidity > 0.7) //if humidity is greater than 0.7 then...
                System.out.println("Dehumidifier activated.");
            else if (temperature > 24) //else, if the humidity is lower, then...
                System.out.println("Fan activated.");
        }
    }
}