//Find is the date formate.
//String d = "01/01/2000"
//Logic = "[0-3][0-9]/[01][0-9]/[0-9]{4}

public class RegularExpressionChallenge2
{
    public static void main(String[] args)
    {
        String d = "01/01/2000";

        // Correct regular expression for the date format

        String regex = "[0-3][0-9]/[01][0-9]/[0-9]{4}";

        // Check if the string matches the date format
        System.out.println(d.matches(regex));
    }
}

/*
Correct Regular Expression:

        [0-3][0-9]: Matches the day part of the date (01 to 31).
        /: Matches the literal / character.
[01][0-9]: Matches the month part of the date (01 to 12).
        /: Matches the literal / character.
[0-9]{4}: Matches a 4-digit year.
*/