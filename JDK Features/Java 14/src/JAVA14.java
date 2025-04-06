public class JAVA14 {
    public static void main(String[] args) {
        // Switch Expressions - Now a Standard Feature
        int day = 6;
        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> {
                System.out.println("Invalid day detected.");
                yield "Unknown";
            }
        };

        System.out.println("Day type: " + dayType);

        // Multi-line block with yield
        int score = 85;
        String grade = switch (score / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> {
                yield "F";
            }
        };

        System.out.println("Grade: " + grade);
    }
}