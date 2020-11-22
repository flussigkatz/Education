package Cat;

public class c1 {
    public static void main(String[] args) {
        Cat cat;
        for (int i = 0; i < 10; i++) {
            System.out.println("Количество кошек: " + Cat.catCount);
            cat = new Cat();
            if (i % 3 == 0) {
                cat.feed(1100);
            }
        }
        System.out.println("Количество кошек: " + Cat.catCount);
    }
}


