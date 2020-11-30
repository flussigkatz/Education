package Module10;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class E10_3_2 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i <= 3; i++) {
            list.add(i);
        }

        System.out.println(list.get(list.size()-1));
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(15);
        list.addLast(28);
        list.remove(0);
        list.set(0, 33);
        list.addFirst(null);
        List<Integer> anotherList = list; // 1
        System.out.println(anotherList);
    }
    /*public static void addCol (Collection<? extends String> collection) {
        System.out.println(collection.size());
    }

    public static void main(String[] args) {
        List<String> collection = new LinkedList<>(); // 2
        collection.add("H");
        addCol(collection);
    }*/
    /*public static void main(String[] args) {
        Queue<String> keywords = new LinkedList<>();
        keywords.add("Java");
        printList(keywords);
    }

    private static void printList(Queue<?> keywords) {
        for (Object o : keywords) {
            System.out.println(o);
        }
    }*/
}
