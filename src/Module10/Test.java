package Module10;

import java.util.Map;
import java.util.TreeMap;

public class Test implements Comparable{
    public static void main(String[] args) {
        Map<Test, Integer> map = new TreeMap<>();
        map.put(new Test(), 2);
        map.put(new Test(), 4);

        System.out.println(map.size());
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
