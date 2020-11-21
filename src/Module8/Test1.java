package Module8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test1 {
    public static void main(String[] args) {
        Calendar calendar1 = new GregorianCalendar(2020, 01, 02);
        Calendar calendar2 = new GregorianCalendar(2020, 01, 02);

        calendar1.add(Calendar.DAY_OF_YEAR, -6905);
        System.out.println("Календарь после add: " + calendar1.getTime());

        calendar2.roll(Calendar.DAY_OF_MONTH, 6);
        calendar2.roll(Calendar.MONTH, 1);
        calendar2.roll(Calendar.YEAR, - 19);
        System.out.println("Календарь после roll: " + calendar2.getTime());
    }
}
