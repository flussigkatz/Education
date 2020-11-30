package Module10;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
    /*public static void main(String[] args) {
        Collection<? extends String> collection = new LinkedList<>("Hello"); // 2
        for (Object c : collection) {
            System.out.println(c);
        }
        System.out.println(collection.size());
    }*/
    public static void main(String[] args) {
        Queue<String> keywords = new LinkedList<>();
        keywords.add("Java");
        printList(keywords);
    }

    private static void printList(Queue<?> keywords) {
        for (Object o : keywords) {
            System.out.println(o);
        }
    }
}
