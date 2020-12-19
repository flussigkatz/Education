package Module11;


import java.util.stream.Stream;

public class Lam {


    public static void main(String[] args) {
        Stream<Integer> infinite = Stream.iterate(2, x -> x * 2);
        System.out.println(infinite.anyMatch(test -> test / 8 == 0));
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
    }
}
