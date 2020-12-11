package Module11;

import java.util.function.Consumer;
import java.util.function.Function;

public class E11_2_8 {



    public static void main(String[] args) {
        int x = 2;
        E11 anon = new E11() {
            @Override
            public void someMethod() {
                System.out.println(x);
            }
        };

        E11 lam = () -> System.out.println(x + 1);

//        Consumer<String> c = System.out::println;
//        c.accept("Hello");

        anon.someMethod();
        lam.someMethod();



    }
}
