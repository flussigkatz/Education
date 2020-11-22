package Other;

public class Loader {

    public static void main(String[] args) {
        System.out.println(formatString("Первая строка", "Вторая строка", 44));
    }

    private static String formatString(String str1, String str2, int number) {
        String res = String.format("Было получено 2 строки: str1 = %s и str2 = %s, а так же одно число num = %d", str1, str2, number);
        return res;
    }
}