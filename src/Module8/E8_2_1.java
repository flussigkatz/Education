package Module8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class E8_2_1 {
    public static void printDifference(Date first, Date second) {
        long milliseconds = Math.abs(first.getTime() - second.getTime()); // Получаем разницу модулей в миллисекундах
        long days = milliseconds / (24 * 60 * 60 * 1000); // Получаем целое кол-во дней
        milliseconds -= days * (24 * 60 * 60 * 1000); // Онимает кол-во дней в миллисекундах
        long hours = milliseconds / (60 * 60 * 1000); // Получаем целое кол-во часов
        milliseconds -= hours * (60 * 60 * 1000); // Онимает кол-во часов в миллисекундах
        long minutes = milliseconds / (1000 * 60); // Получаем целое кол-во минут
        milliseconds -= minutes * (1000 * 60); // Онимает кол-во минут в миллисекундах
        long seconds = milliseconds / (1000); // Получаем целое кол-во секунд
        String format = "Разница между датами: %s дней %s часов %s минут %s секунд." + System.lineSeparator();
        System.out.printf(format, days, hours, minutes, seconds); // печатаем результат в указанном выше формате
    }
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss"); // В этом формате будем вводить дату
//        Date one = sdf.parse("27.07.2020 10:20:00"); // вводим дату используя метод parse форматера
        Date one = new Date();
        one = sdf.parse(String.valueOf(one));
        Date two = sdf.parse("26.07.2020 14:50:10");
        System.out.println(one);
        printDifference(one, two); // Результат не зависит от последовательности аргументов
        printDifference(two, one); // Печатается "Разница между датами: 0 дней 19 часов 29 минут 50 секунд."
    }
}

