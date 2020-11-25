package Module9;

import java.text.NumberFormat;
import java.text.ParseException;

public class E9_3 {
    public static void main(String[] args) {
        try {
            NumberFormat nf = NumberFormat.getInstance();
            //специально создаем ситуацию, которая приведет к исключению
            System.out.println(nf.parse("sss"));
        } catch (
                ParseException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Конец программы.");


        String szShortString = "123";
        try {
            char chr = szShortString.charAt(10);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}