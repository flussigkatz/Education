package Module10;

import java.util.Comparator;
import java.util.TreeSet;

public class Sorted implements Comparable<Sorted>, Comparator<Sorted> {

    private int num;
    private String text;

    public Sorted(int num, String text) {
        this.num = num;
        this.text = text;
    }

    @Override
    public String toString() {
        return "" + num;
    }

    @Override
    public int compareTo(Sorted o) {
        return text.compareTo(o.text);
    }

    @Override
    public int compare(Sorted o1, Sorted o2) {
        return o1.num - o2.num;
    }

    public static void main(String[] args) {
        Sorted s1 = new Sorted(44, "a");
        Sorted s2 = new Sorted(33, "b");
        Sorted s3 = new Sorted(22, "c");
        Sorted s4 = new Sorted(11, "d");
        TreeSet<Sorted> t1 = new TreeSet<>();
        t1.add(s1);
        t1.add(s2);
        TreeSet<Sorted> t2 = new TreeSet<>(s3);
        t2.add(s1);
        t2.add(s2);
        t2.add(s3);
        t2.add(s4);
        System.out.println(t1 + " " + t2);
    }

}