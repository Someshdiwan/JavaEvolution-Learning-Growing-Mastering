import java.util.Scanner;

public class NestedSwitch2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empID = in.nextInt();
        in.nextLine();  // Consume newline
        System.out.print("Enter Department (if applicable): ");
        String department = in.nextLine();

        // Traditional switch statement
        System.out.println("\n--- Traditional Switch Output ---");
        switch (empID) {
            case 1:
                System.out.println("Kunal Kushwaha");
                break;
            case 2:
                System.out.println("Rahul Rana");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No valid department entered");
                }
                break;
            default:
                System.out.println("Enter correct EmpID");
        }

        // Enhanced switch expression (Java 14+)
        System.out.println("\n--- Enhanced Switch Output ---");
        switch (empID) {
            case 1 -> System.out.println("Kunal Kushwaha");
            case 2 -> System.out.println("Rahul Rana");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No valid department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }

        in.close();
    }
}
