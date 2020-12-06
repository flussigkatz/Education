package Module11;

import java.time.*;

public class E11_1 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(16, 30); // строка 1
        time = time.withHour(14).plusMinutes(15);
        System.out.println(time);
    }
}
