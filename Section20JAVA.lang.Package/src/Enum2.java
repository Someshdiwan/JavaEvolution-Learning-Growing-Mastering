enum Status {
    Running, failed, Pending, Success;
}

public class Enum2 {
    public static void main(String[] args) {
        int i =5;

        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());

        Status s1= Status.Success;
        System.out.println(s1);
        System.out.println(s1.ordinal());

        Status s2 = Status.Pending;

        if(s2 == Status.Running)
            System.out.println("ALL Good");
        else if(s2==Status.failed)
            System.out.println("Try Again");
        else if(s2==Status.Pending)
            System.out.println("Please Wait");
        else
            System.out.println("Done");

        Status s3=Status.Success;
        switch(s) {
            case Running:
                System.out.println("All Good");
                break;

            case failed:
                System.out.println("Try Again");
                break;

            case Pending:
                System.out.println("Please Wait");
                break;

            default:
                System.out.println("Done");
                break;
        }
    }
}

/*
1. ordinal():
   - Enum constant ki position (0-based index) return karta hai.
   - Example: Running -> 0, failed -> 1, Pending -> 2, Success -> 3.

2. Comparison:
   - Enums ko == se compare karte hain (safe hai, equals() ki zaroorat nahi).
   - if(s2 == Status.Pending) ✅

3. switch-case:
   - Enums directly switch-case me use hote hain.
   - Cleaner aur faster than multiple if-else.

4. Enum constants:
   - Always UPPERCASE likhne ka convention hota hai (Running → RUNNING).
   - Aapke enum me "failed" lowercase hai, technically valid hai but not standard convention.
*/
