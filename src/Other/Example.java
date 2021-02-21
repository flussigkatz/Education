package Other;

import java.util.*;

public class Example {

    public static void main(String args[]) {
        // Берём список элементов Dog
        List<Dog> list = new ArrayList<>();

        list.add(new Dog("Шегги", 3));
        list.add(new Dog("Лэси", 2));
        list.add(new Dog("Роджер", 10));
        list.add(new Dog("Томми", 4));
        list.add(new Dog("Тамми", 1));
        Collections.sort(list);   // Сортируем список массивов

        for(Dog a: list)   // Выводим сортированный список имён
            System.out.print(a.getDogName() + ", ");

        // Сортируем список массивов, используя компаратор
        Collections.sort(list, new Dog());
        System.out.println(" ");

        for(Dog a: list)   // Выводим сортированный список возрастов
            System.out.print(a.getDogName() +"  : "+ a.getDogAge() + ", ");
    }
}