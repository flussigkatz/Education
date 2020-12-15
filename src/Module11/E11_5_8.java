package Module11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

    /*private static int streamMethod(List<String> stringList) {
        int mult = 1;
        IntStream.Builder builder = IntStream.builder();
        for (String q : stringList) {
            builder.accept(Integer.parseInt(q));
        }
        builder.build().reduce(x -> mult * x);
        return mult;

    }*/

    private static Integer streamMethod(List<String> stringList) {
        List<Integer> integerList = new ArrayList<>();
        for (String q : stringList) {
            integerList.add(Integer.parseInt(q));
        }
        Optional<Integer> mult = integerList.stream().reduce((int1, int2) -> int1 * int2);
//        Optional<Integer> mult = integerList.stream().reduce((integer, integer2) -> integer * integer2);
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

    public static void multi (int x) {

    }

}
