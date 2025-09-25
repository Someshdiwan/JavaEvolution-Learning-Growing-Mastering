import java.util.EnumSet;

// Define an enum type
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumSetDemo {
    public static void main(String[] args) {
        // 1. Create an empty EnumSet
        EnumSet<Day> emptySet = EnumSet.noneOf(Day.class);
        System.out.println("Empty EnumSet: " + emptySet);

        // 2. Create an EnumSet with specific elements
        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
        System.out.println("Weekend: " + weekend);

        // 3. All days (full set)
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        System.out.println("All days: " + allDays);

        // 4. Range of days (continuous sequence in enum declaration)
        EnumSet<Day> workDays = EnumSet.range(Day.MONDAY, Day.FRIDAY);
        System.out.println("Work days: " + workDays);

        // 5. Complement (all elements NOT in weekend)
        EnumSet<Day> weekDays = EnumSet.complementOf(weekend);
        System.out.println("Week days: " + weekDays);

        // 6. Adding elements
        emptySet.add(Day.MONDAY);
        emptySet.add(Day.FRIDAY);
        System.out.println("After adding MONDAY and FRIDAY: " + emptySet);

        // 7. Removing an element
        emptySet.remove(Day.MONDAY);
        System.out.println("After removing MONDAY: " + emptySet);

        // 8. Iteration
        System.out.print("Iterating over weekend: ");
        for (Day d : weekend) {
            System.out.print(d + " ");
        }
        System.out.println();

        // 9. Checking membership
        System.out.println("Does weekend contain SUNDAY? " + weekend.contains(Day.SUNDAY));
        System.out.println("Does weekend contain WEDNESDAY? " + weekend.contains(Day.WEDNESDAY));
    }
}

/* EnumSet is the fastest and most memory-efficient way to work with sets of enums.
   It’s especially useful for flags, modes, schedules, and state sets.

1.	Empty Set:
EnumSet.noneOf(Day.class) → Creates an empty EnumSet for Day.
2.	Specific Elements:
EnumSet.of(Day.SATURDAY, Day.SUNDAY) → Weekend set.
3.	All Constants:
EnumSet.allOf(Day.class) → Includes every enum constant.
4.	Range:
EnumSet.range(Day.MONDAY, Day.FRIDAY) → Continuous range of days (MONDAY to FRIDAY).
5.	Complement:
EnumSet.complementOf(weekend) → Opposite of weekend (all weekdays).
6.	Adding/Removing:
Works like a normal set, but internally toggles bits in a bit vector.
7.	Iteration:
Iterates in natural enum order (not insertion order).
8.	Membership Test:
contains() → Constant time O(1) check.
*/
