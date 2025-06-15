public class BreakingTheIce {
    public static void main(String[] args) {
        int temperature = 100;
        int ice = 0;
        boolean machineOn = true;

        System.out.println("Let's cool this water!");
        while (machineOn) {
            temperature -= 5;
            if (temperature > 40) {
                System.out.println("Too hot! Thermometer unusable.");
                continue;
            }
            System.out.println("Temperature -> " + temperature);
            if (temperature <= ice) {
                System.out.println("We have ice!");
                break;
            }
        }
    }
}
