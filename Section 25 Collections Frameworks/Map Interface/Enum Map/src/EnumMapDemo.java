import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        // Create EnumMap with Day enum as the key type.
        Map<Day, String> map = new EnumMap<>(Day.class);

        // Internally → array created with size = number of enum constants (7 here).
        // Example layout after inserts:
        // Index:   0        1        2    3    4    5    6
        // Enum:  MONDAY  TUESDAY  WED ... ...  ...  SUNDAY
        // Value: "Walk"  "Gym"   null  null null null "Sleep Relax"

        // Put some values.
        map.put(Day.TUESDAY, "Gym");
        map.put(Day.MONDAY, "Walk");
        map.put(Day.SUNDAY, "Sleep Relax");

        // Access value directly using a key (ordinal → index lookup).
        String s = map.get(Day.TUESDAY);
        System.out.println(s);  // Output: Gym

        // Printing entire EnumMap.
        // Note: EnumMap preserves the natural order of the enum constants (MONDAY → SUNDAY).
        System.out.println(map);
        // Output: {MONDAY=Walk, TUESDAY=Gym, SUNDAY=Sleep Relax}
    }
}

/* Enum Day - represents days of the week.
 * Each constant has an implicit ordinal:
 * MONDAY=0, TUESDAY=1, ..., SUNDAY=6
 */

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

/*
Demonstrates how EnumMap works internally.
Key Points:
1. EnumMap is a specialized Map implementation for use with enum keys.
2. Internally, it uses an array where each index corresponds to the ordinal of the enum constant.
   Example: MONDAY → 0, TUESDAY → 1, etc.
 3. It does NOT use hashing (no hashCode(), no buckets).
    → Instead, it directly maps enum.ordinal() to array index.
 4. Advantages:
      - Faster than HashMap (direct index access).
      - Very memory-efficient.
      - Maintains natural ordering of enum constants (by their declaration order).
5. Null keys are NOT allowed (throws NullPointerException).
   Null values ARE allowed.
*/
