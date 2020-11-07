import java.util.Scanner;

public class Tel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String telnum = cleansimb(scanner.nextLine());
        String telnum = cleansimb("8(999)000 88 77");
        System.out.println(formattelnum(telnum));
    }

    private static String cleansimb(String nextLine) {
        String res = nextLine.replaceAll("[^0-9]", "");
        return res;
    }

    private static String formattelnum(String telnum) {
        String res = "+7" + " " + telnum.substring(1, 4) + " " + telnum.substring(4, 7) + " " + telnum.substring(7, 9) + " " + telnum.substring(9);
        return res;
    }
}
