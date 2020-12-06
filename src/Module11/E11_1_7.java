package Module11;

import java.time.*;
import java.util.Date;

public class E11_1_7 {
    public static void main(String[] args) {
        Date date = new Date();
        Instant instant = date.toInstant();
//        ZonedDateTime zdt = instant.atZone(ZoneId.of("Europe/Moscow"));
        ZonedDateTime zdt = instant.atZone(ZoneId.of("America/Cuiaba"));
        System.out.println(ZoneId.getAvailableZoneIds());
        LocalTime localTime = zdt.toLocalTime();
        System.out.println(localTime);
    }
}
