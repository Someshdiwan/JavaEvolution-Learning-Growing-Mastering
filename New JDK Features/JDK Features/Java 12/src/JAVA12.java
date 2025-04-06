// JAVA12.java
package Java12;

public class JAVA12 {
    public static void main(String[] args) {
        // Switch Expressions (Preview Feature)
        int day = 3;
        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> {
                System.out.println("Unknown day, assigning default...");
                yield "Invalid day";
            }
        };

        System.out.println("Day type: " + dayType);

        // Note about Shenandoah GC (can't be shown directly in code)
        System.out.println("\n[Note] Shenandoah GC was introduced as an experimental GC in Java 12.");
        System.out.println("Use JVM flags like: -XX:+UseShenandoahGC to test its low-pause capabilities.");
    }
}