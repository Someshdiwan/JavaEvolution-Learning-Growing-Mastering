package DateandTimeAPI;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class ChronoFieldDemo {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();

        System.out.println(dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println(dt.get(ChronoField.AMPM_OF_DAY));
        System.out.println(dt.get(ChronoField.YEAR_OF_ERA));
    }
}
