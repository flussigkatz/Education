package Cat;

public class Cat {

    private double weight;
    private String name;
    private int age;
    private String color;
    public static int catCount;


    //Конструктор по умолчанию
    public Cat() {
        this(3000, "Barsik", 1, "Grey");
    }



    //Конструктор, принимающий параметры
    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
        catCount++; //Увеличиваем счётчик кошек
    }

    public void feed(double foodAmount) {
        if(foodAmount < 1000) {
            System.out.println("Кошку покормили! Она довольна!");
        } else {
            System.out.println("Кошку перекормили и она лопнула.");
            catCount--;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}