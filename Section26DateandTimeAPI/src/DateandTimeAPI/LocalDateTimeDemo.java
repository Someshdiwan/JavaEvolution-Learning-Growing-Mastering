package DateandTimeAPI;
import java.time.*;
import java.time.MonthDay;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        // Current date-time with time zone information (e.g., Asia/Kolkata, UTC offset)
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        // Current date-time with only UTC offset (e.g., +05:30) but without time zone rules
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        // Current time of day with an offset from UTC (time only, no date)
        OffsetTime offsetTime = OffsetTime.now();

        // The system’s default time zone (e.g., Asia/Kolkata, America/New_York)
        ZoneId zoneId = ZoneId.systemDefault();

        // Represents a month and day without a year (useful for recurring events like birthdays)
        MonthDay monthDay = MonthDay.now();

        // Represents a combination of year and month (useful for credit card expiry, payroll, etc.)
        YearMonth yearMonth = YearMonth.now();

        // Represents only the year (useful for historical data, age calculation, etc.)
        Year year = Year.now();

        // Represents a date-based amount of time (e.g., 2 years, 3 months, 5 days)
        Period period = Period.of(2, 3, 5);

        // Represents a time-based amount of time (e.g., 5 hours, 30 seconds)
        Duration duration = Duration.ofHours(5);

        // A point in time on the UTC timeline (timestamp)
        Instant instant = Instant.now();

        // Print results
        System.out.println("ZonedDateTime: " + zonedDateTime);
        System.out.println("OffsetDateTime: " + offsetDateTime);
        System.out.println("OffsetTime: " + offsetTime);
        System.out.println("ZoneId: " + zoneId);
        System.out.println("MonthDay: " + monthDay);
        System.out.println("YearMonth: " + yearMonth);
        System.out.println("Year: " + year);
        System.out.println("Period: " + period);
        System.out.println("Duration: " + duration);
        System.out.println("Instant: " + instant);
    }
}

/*
1. ZonedDateTime → Full date-time with a time zone (rules + offset).
2. OffsetDateTime → Date-time with only a fixed UTC offset (no daylight saving rules).
3. OffsetTime → Time of day + offset from UTC (no date).
4. ZoneId → Represents a time zone identifier (like "Asia/Kolkata").
5. MonthDay → Stores month + day, without year (e.g., 12-25 → Christmas).
6. YearMonth → Stores year + month (useful for card expiry).
7. Year → Stores only year value.
8. Period → Human-readable period (years, months, days).
9. Duration → Machine-readable time span (hours, minutes, seconds, nanoseconds).
10. Instant → Machine timestamp, precise point on UTC timeline.
*/
