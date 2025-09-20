import java.time.*;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();

        System.out.println("Today's Date and Time: "+d);

        //d.setTime(21);
        d.setHours(21);

        System.out.println(d);

        //LocalDate dt = new LocalDate();
        //you can not create a new date.

        LocalDate dt = LocalDate.now();
        System.out.println(dt);

        LocalDate d2 = LocalDate.now(Clock.systemDefaultZone());
        //the new date is not able to create. Now means date today.
        System.out.println(d2);

        LocalDate d3 = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(d3);

        LocalDate d4 = LocalDate.of(2020, Month.MARCH,10);
        System.out.println(d4);

        LocalDate d5 = LocalDate.ofEpochDay(1000);
        LocalDate d6 = LocalDate.ofEpochDay(1);
        System.out.println(d5);
        System.out.println(d6);

        LocalDate d7 = LocalDate.parse("2021-01-03");
        System.out.println(d7);

        LocalDate d8 = d7.plusMonths(6);

        System.out.println("Get New Date with 6 months added: "+d8);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalTime t2 = t.minusHours(3);
        System.out.println(t2);

        LocalDateTime dt1 = LocalDateTime.now();
        System.out.println(dt1);
        System.out.println(dt1.getNano());
        System.out.println(dt1.getDayOfMonth());
    }
}
