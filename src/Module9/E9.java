package Module9;

public class E9 {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("1");
        }
    }
}
