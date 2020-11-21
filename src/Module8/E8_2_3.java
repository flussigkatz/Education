package Module8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class E8_2_3 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd.MM.yyyy");
        Calendar date = Calendar.getInstance();
        System.out.println(sdf.format(date.getTime()));

        Date date1 = new Date();
        System.out.println(sdf.format(date1));

    }
}
