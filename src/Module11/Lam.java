package Module11;


import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class Lam {


    public static void main(String[] args) {
        int a = 3;
        int b = 2;
//        int r = (int a, int b) -> {  return a + b; };
//        BiFunction<Integer, Integer, Integer> c = Integer::sum;
        Met<Integer, Integer, Integer> c = (x , y) -> { return (x + y);};
        Met<Integer, Integer, Integer> m = Mref::refmet;
        Met<Integer, Integer, Integer> im = Met::refm;
        System.out.println(c.apply(a,b));
        System.out.println(m.apply(a,b));
        System.out.println(im.apply(a,b));
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list.forEach(n -> System.out.println(n));
    }
}
