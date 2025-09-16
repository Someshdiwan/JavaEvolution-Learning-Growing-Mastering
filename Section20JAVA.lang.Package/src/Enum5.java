enum Day1 {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

// Driver class that contains an object of "Day" and main().
class Enum55 {
    Day1 day; // enum variable.

    //Constructor: object banate time enum value pass hoti hai.
    public Enum55(Day1 day) {
        this.day = day;
    }

    // enum ke basis pe switch-case run hota hai.
    // Prints a message about the day using a switch-case.
    public void dayIsLike() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    public static void main(String[] args) {
        String str = "MONDAY";
        Enum55 t1 = new Enum55(Day1.valueOf(str));
        t1.dayIsLike();
    }
}

/*
1. Enum values fixed constants hote hain (MONDAY...SUNDAY).
2. `Day1.valueOf("MONDAY")` → String ko enum constant me convert karta hai.
3. Switch-case ke saath enum kaafi readable hai.
4. Ek case ke niche multiple enum constants bhi handle kar sakte ho.
5. Enum ka toString() by default constant ka name return karta hai.
*/
