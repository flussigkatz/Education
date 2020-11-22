package Module8;

import java.io.*;
import java.net.URL;

public class E8_4_3 {
    public static void main(String[] args) {
        try (BufferedInputStream in = new BufferedInputStream(new URL("localhost/Media/file.txt").openStream());
        FileOutputStream fileOutputStream = new FileOutputStream("localhost/Media/filecopy.txt")){
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        } catch (IOException e) {
        }
    }
}
