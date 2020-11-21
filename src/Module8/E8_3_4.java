package Module8;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class E8_3_4 {
    public static void main(String[] args) throws IOException {
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String title = reader.readLine();*/
        File file = new File("src/file8_3_4.txt");
        FileInputStream inStream = new FileInputStream(file);
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
        System.out.println(sdf.format(date) + System.lineSeparator());
        String s = "";
        int c;
        while ((c = inStream.read()) != -1) {
            s = s + (char)c;
        }
        s = "New first record " + sdf.format(date) + "\n" + s + "\n" + "New last record " + sdf.format(date);
        FileOutputStream outStream = new FileOutputStream(file);
        for (int x = 0; x < s.length(); x++){
            outStream.write(s.charAt(x));
        }
        inStream.close();
        outStream.close();
    }
}
