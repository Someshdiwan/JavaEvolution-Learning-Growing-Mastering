package DateandTimeAPI;
import java.time.*;
import java.time.MonthDay;

/*
Explanation of Date-Time Classes Mentioned:

ZonedDateTime ? Represents date and time with time zone.
OffsetDateTime ? Date-time with an offset from UTC.
OffsetTime ? Time with an offset from UTC.
ZoneId ? Represents time zone ID.
MonthDay ? Represents a month and day (e.g., birthday).
YearMonth ? Represents a year and month.
Year ? Represents only a year.
Period ? Represents a period (e.g., 2 years, 3 months).
Duration ? Represents a duration (e.g., 5 hours, 30 minutes).
Instant ? Represents a timestamp (date-time in UTC).
*/

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        OffsetTime offsetTime = OffsetTime.now();
        ZoneId zoneId = ZoneId.systemDefault();
        MonthDay monthDay = MonthDay.now();
        YearMonth yearMonth = YearMonth.now();
        Year year = Year.now();
        Period period = Period.of(2, 3, 5); // 2 years, 3 months, 5 days
        Duration duration = Duration.ofHours(5);
        Instant instant = Instant.now();

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
