package Other;

import java.util.*;

public class TestClass {
    public static void print(List<? extends String> list) {
//        list.add("Hello World!");
        System.out.println(list.get(0));
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("Hello World!");
//        TestClass.print(list);
    }
}