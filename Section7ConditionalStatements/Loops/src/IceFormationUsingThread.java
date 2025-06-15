import java.util.Scanner;

public class IceFormationUsingThread {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🌡️ Breaking the Ice - Cooling Simulation");
        System.out.print("Enter starting temperature (°C): ");
        int temperature = scanner.nextInt();

        System.out.print("Enter cooling rate per cycle (°C): ");
        int decrement = scanner.nextInt();

        boolean machineOn = true;

        System.out.println("\nStarting cooling process...\n");

        while (machineOn) {
            Thread.sleep(1000); // Delay to simulate real-time cooling

            temperature -= decrement;

            if (temperature > 40) {
                System.out.println("Too hot! Thermometer unusable.");
                continue;
            }

            System.out.println("Temperature -> " + temperature + "°C");

            if (temperature <= 0) {
                System.out.println("❄️ We have ice!");
                break;
            }
        }

        scanner.close();
    }
}
