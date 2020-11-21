package Module8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class E8_3_3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream outStream = new FileOutputStream("src/file8_3_3.txt");
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd.MM.yyyy");
        System.out.println(sdf.format(date) + System.lineSeparator());
        String s = sdf.format(date);
        for (int x = 0; x < s.length(); x++){
            outStream.write(s.charAt(x));
        }
        outStream.close();
    }
}
