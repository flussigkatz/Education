package Module10;

import java.util.LinkedList;
import java.util.List;

public class E10_4_6 {
    public static void main(String[] args){/*
        LinkedList<Integer> list = new LinkedList();
        fillList(99,0, list);
        System.out.println("Fill list 0-99");
        printList(list);
        list.clear();
        System.out.println("Clear list and print it");
        printList(list);
        System.out.println("Fill list 99-0");
        fillList(0,99, list);
        printList(list);*/




        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println(list);

        for (int i = 0, j = 99; i < 50 && j >= 50; i++, j--) {
            list.set(j, i);
            list.set(i, j);
//            int start = list.get(i);
//            int end = list.get(j);
//            list.set(j, start);
//            list.set(i, end);
        }

        System.out.println(list);
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
}
