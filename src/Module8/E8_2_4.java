package Module8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class E8_2_4 {
        public static void printDifference(Date first, Date second) {
            long milliseconds = Math.abs(first.getTime() - second.getTime());
            long days = milliseconds / (24 * 60 * 60 * 1000);
            String format = "Разница между датами: %s дней" + System.lineSeparator();
            System.out.printf(format, days);
        }
        public static void main(String[] args) throws ParseException {
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            Date date = new Date();
            Date birthDay = sdf.parse("09.04.2021");
            System.out.println(sdf.format(date));
            System.out.println(sdf.format(birthDay));
            printDifference(date, birthDay);

        }
}
