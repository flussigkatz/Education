package Module11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class E11_5_8 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        System.out.println("oldMethod: " + oldMethod(stringList));
        System.out.println("streamMethod: " + streamMethod(stringList));

    }

    private static Integer streamMethod(List<String> stringList) {
        List<Integer> integerList = new ArrayList<>();
        for (String q : stringList) {
            integerList.add(Integer.parseInt(q));
        }
        Optional<Integer> mult = integerList.stream().reduce((int1, int2) -> int1 * int2);
        return mult.get();

    }

    private static int oldMethod(List<String> stringList) {
        int x = 1;
        for (String s : stringList) {
            int i = (Integer.parseInt(s));
            x *= i;
        }
        return x;
    }
}
