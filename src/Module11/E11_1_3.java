package Module11;

import java.time.*;

public class E11_1_3 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(00,00);
        LocalTime nowTime = LocalTime.now();
        Duration duration = Duration.ofHours(16);
        System.out.println(chekTime(time, nowTime, duration));
    }

    private static boolean chekTime(LocalTime x, LocalTime y, Duration z) {
        return x.plus(z).isBefore(y);
    }


}
