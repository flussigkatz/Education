package Module8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class CopyFile {
    public static void main(String[] args) throws IOException {

        File inFile = new File("src/infile.txt"); //получаем информацию о файле
        File outFile = new File("src/outfile.txt"); //получаем информацию о файле
        FileInputStream inStream = new FileInputStream(inFile); //Создаем экземпляр класса FileInputStream
        FileOutputStream outStream = new FileOutputStream(outFile); //Создаем экземпляр класса FileOutputStream

        int c;
        while ((c = inStream.read()) != -1) {
            outStream.write(c);
        }
        inStream.close(); // закрываем поток
        outStream.close(); // закрываем поток

    }
}