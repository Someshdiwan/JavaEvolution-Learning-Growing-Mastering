import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {
    public static void main(String[] args) {
        //Gregorian Calendar we follow.
        GregorianCalendar gc = new GregorianCalendar();

        System.out.println(gc.isLeapYear(2020));
        System.out.println("Today Date: "+gc.get(Calendar.DATE));

        System.out.println(gc.get(Calendar.MONTH));

        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));

        System.out.println(gc);
    }
}
