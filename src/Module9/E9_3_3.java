package Module9;

public class E9_3_3 {
    public static void main(String[] args) {
        int[] array = new int[3];//2
        String str = null;//3
        try {

            subRoutine();//1

            System.out.println(array[4]);

            System.out.println(str.length());

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException ex) {
            System.err.println("Err");
        }

    }

    public static void subRoutine() {
        int d = 0;
        int a = 10 / d;
    }
}
