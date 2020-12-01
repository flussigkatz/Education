package Module10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class tmp {
    public static void main(String[] args){
        Date firtime = new Date();
        LinkedList<Integer> list = new LinkedList();
        fillList(99,0, list);
        System.out.println("Fill list 0-99");
        printList(list);
        list.clear();
        System.out.println("Clear list and print it");
        printList(list);
        System.out.println("Fill list 99-0");
        fillList(0,99, list);
        printList(list);
        SimpleDateFormat sdf = new SimpleDateFormat("ss");



        System.out.println(list);
        Date sectime = new Date();
        printDifference(firtime, sectime);
    }

    private static void fillList(int x, int y, LinkedList list) {
        if (x > y) {
            for (int i = x; i >= y; i--) {
                list.addFirst(i);
            }
        } else {
            for (int i = x; i <= y; i++) {
                list.addFirst(i);
            }
        }
    }
    private static void printList(LinkedList list) {
        System.out.println(list.toString());
    }

    public static void printDifference(Date first, Date second) {
        long milliseconds = Math.abs(first.getTime() - second.getTime());
//        long days = milliseconds / (24 * 60 * 60 * 1000);
//        long seconds = milliseconds / (1000);
        String format = "Выполнено за %s милисекунду" + System.lineSeparator();
        System.out.printf(format, milliseconds);
    }
}
