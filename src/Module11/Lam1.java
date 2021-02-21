package Module11;


import java.util.function.*;

public class Lam1 {


    public static void main(String[] args) {
        Met1 a = new Met1(){
            @Override
            public void method() {
                System.out.println("Anonymous class");
            }
        };

        Met1 b = () -> System.out.println("Lambda expression");




        a.method();
        b.method();

    }

}
