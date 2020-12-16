package Module11;

import java.util.*;
import java.util.stream.Stream;

public class E11_5_10 {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(117d, 12.2d, 66d, 18.5d);
        List<String> list2 = Arrays.asList("15", "18.5", "117", "22.2");
        List<Double> doubles = new ArrayList<>();
        for (String s : list2) {
            doubles.add(Double.valueOf(s));
        }
        for (Double d : list) {
            doubles.add(d);
        }
        firstMet(list, doubles);
        System.out.println("---------------");
        streamMet(doubles);
        System.out.println("================");
        skillMet(list,list2);

    }

    private static void skillMet(List<Double> list, List<String> list2) {
        Stream.concat(list.stream(),list2.stream().map(Double::valueOf))
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    private static void streamMet(List<Double> list) {
        list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    private static void firstMet(List<Double> list, List<Double> doubles) {
        Set<Double> sortedDoubles = new TreeSet<>(Comparator.reverseOrder());
        sortedDoubles.addAll(list);
        sortedDoubles.addAll(doubles);
        for (double d : sortedDoubles) {
            System.out.println(d);
        }
    }
}
