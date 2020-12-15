package Module11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class E11_5_8 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        System.out.println("oldMethod: " + oldMethod(stringList));
        System.out.println("streamMethod: " + streamMethod(stringList));
    }

    private static int streamMethod(List<String> stringList) {
        IntStream.Builder builder = IntStream.builder();
        for (String q : stringList) {
            builder.accept(Integer.parseInt(q));
        }
        return builder.build().sum();

    }

    private static int oldMethod(List<String> stringList) {
        int x = 0;
        for (String s : stringList) {
            x = x + (Integer.parseInt(s));
        }
        return x;
    }
}
