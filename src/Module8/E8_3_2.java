package Module8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class E8_3_2 {
    public static void main(String[] args) {
        File f = new File("src/file2.txt");//должен существовать!
        int b, count = 0;
        int words = 1;
        try {
            FileReader is = new FileReader(f);
//            FileInputStream is = new FileInputStream(f); // альтернативный вариант
            while ((b = is.read()) != -1) { //чтение
//                System.out.print((char) b);
                count++;
                if ((char) b == ' ') {
                    words++;
                }
            }
            is.close(); // закрытие потока ввода
        } catch (IOException e) {
            System.err.println("ошибка файла: " + e);
        }
        if (count == 0) {
            words = 0;
        }
//        System.out.print("\n число байт = " + count + System.lineSeparator());
        System.out.println("Количество слов в файле: " + words);
    }
}