package Module11;

import java.time.*;

public class E11_1_1 {
    public static void main(String[] args) {
//        System.out.println(ZoneId.getAvailableZoneIds());
        System.out.println(ZonedDateTime.now(ZoneId.of(("Europe/Moscow"))));
        ZonedDateTime zdt = ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.of("Europe/Moscow"));
        System.out.println(zdt);
    }
}
