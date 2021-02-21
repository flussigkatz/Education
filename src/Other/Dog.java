package Other;

import java.util.*;

class Dog implements Comparator<Dog>, Comparable<Dog> {
    private String name;
    private int age;
    Dog() {
    }

    Dog(String n, int a) {
        name = n;
        age = a;
    }

    public String getDogName() {
        return name;
    }

    public int getDogAge() {
        return age;
    }

    // Переопределяем метод compareTo
    @Override
    public int compareTo(Dog d) {
        return (this.name).compareTo(d.name);
    }

    // Переопределяем метод compare для сортировки возраста
    @Override
    public int compare(Dog d, Dog d1) {
        return d.age - d1.age;
    }
}

