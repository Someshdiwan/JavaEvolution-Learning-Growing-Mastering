package DateandTimeAPI;


import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateTimeFormatDemo {
    public static void main(String[] args) {
        //y =year
        //M = month
        //d = day

        //h = hour(0-12)
        //H = Hour(0-23)
        //m = minute
        //s =seconds
        //S = milliseconds
        //z = time zone
        //Z = offset
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(df.format(dt));

        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        System.out.println(df2.format(dt));

        ZonedDateTime dt3 = ZonedDateTime.now();
        DateTimeFormatter df4 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss z");
        System.out.println(df4.format(dt3));
    }
}
