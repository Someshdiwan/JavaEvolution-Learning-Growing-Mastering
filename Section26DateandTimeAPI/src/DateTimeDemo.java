import java.util.Date;

public class DateTimeDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        //Current Date and Time .

        Date d1 = new Date(System.currentTimeMillis());
        System.out.println(d1);

        Date d2 = new Date("1/1/1990");
        System.out.println(d2);

        Date d3 = new Date();
        System.out.println(d3.getTime());


        Date d4 = new Date();
        System.out.println("Day: "+d4.getDay());

        Date d5 = new Date();
        System.out.println("Month, Jan =0, Feb=1 Like this: "+d5.getMonth());

        Date d6 = new Date();
        System.out.println("Date: "+d6.getDate());
    }
}
