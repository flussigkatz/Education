package Other;

public class Cat {

    private double weight;
    private String name;
    private int age;
    private String color;

    //Конструктор по умолчанию
    public Cat() {
        weight = 3000;
        name = "Barsik";
        age = 1;
        color = "Grey";
    }

    //Конструктор, принимающий параметры
    public Cat(double weight1, String name1, int age1, String color1) {
        weight = weight1;
        name = name1;
        age = age1;
        color = color1;
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