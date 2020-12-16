package Module11;

import java.util.stream.IntStream;

public class E11_5_11 {
    public static void main(String[] args) {
        int intStream = IntStream.rangeClosed(1, 100).skip(50).filter(x -> x % 2 == 0 || x % 5 == 0).sum();
        System.out.println(intStream);
    }
}
