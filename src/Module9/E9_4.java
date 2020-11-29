package Module9;

import java.io.FileNotFoundException;
import java.io.IOException;

public class E9_4 {
    public static void main(String[] args) {
        try {
            readFromFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("Done");
    }

    public static void readFromFile() throws IOException {
        System.out.print("Reading line ");
    }
}
