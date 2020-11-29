package Module9;

public class ThrowsGenerate {
    //метод носит пометку throws. Это говорит о том, что метод порождает исключение
    public static void throwOne() throws IllegalAccessException {
        System.out.println("Внутри throwOne.");
        throw new IllegalAccessException("demo"); //бросаем исключение
    }
    //В методе main() отлавливаем это исключение
    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException ex) {
            System.out.println("Выброс " + ex);
        }
    }
}
