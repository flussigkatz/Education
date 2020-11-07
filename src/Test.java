public class Test {
    public static void main(String[] args) {
        String words = "asd";
        words = words.replace(words.charAt(0), Character.toUpperCase(words.charAt(0)));
        System.out.println(words);
    }
}
