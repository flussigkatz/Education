package Module11;


public class Lam {


    public static void main(String[] args) {
        int a = 3;
        int b = 2;
//        int r = (int a, int b) -> {  return a + b; };
//        BiFunction<Integer, Integer, Integer> c = Integer::sum;
        Met<Integer, Integer, Integer> c = (x , y) -> { return (x + y);};
        Met<Integer, Integer, Integer> m = Mref::refmet;
        System.out.println(c.apply(a,b));
        System.out.println(m.apply(a,b));
    }
}
