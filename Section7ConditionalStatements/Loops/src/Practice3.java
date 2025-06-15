public class Practice3 {
    public static void main(String[] args) {
        double temperature = 25.0; //in Celsius degrees
        double humidity = 0.75;    //as a percentage (0.75 = 75%)

        boolean smartMode = false;  //smart mode is off

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
