import java.util.Scanner;

public class Sring1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name));
            }
        }
    }

    private static boolean checkName(String name) {
        String[] words = name.trim().split(" ");
        return words.length == 3;
    }

    private static String formatName(String name) {
        String[] words = name.trim().split(" ");
        sortByLength(words);
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            char firstChar = str.charAt(0);
            if (!Character.isUpperCase(firstChar)) {
                result += Character.toUpperCase(firstChar) + str.substring(1) + " ";
                System.out.println(str.substring(1));
            } else {
                result += str + "";
            }
        }
        return result;
    /*private static String formatName(String name) {
        String res = "";
        String[] words = name.trim().split(" ");
        sortByLength(words);
        for (int x = 0; x < words.length; x++) {
            words[x] = words[x].replace(words[x].charAt(0), Character.toUpperCase(words[x].charAt(0)));
        }
        for (String c : words) {
            res += c + " ";
        }
        return res.trim();*/
    }

    private static void sortByLength(String[] words) {
        String temp = "";
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
    }

    /*private static boolean checkName(String name) {
        boolean res = false;
        int c = 0;
        name = name.trim();
        for (char x = 0; x < name.length() - 1; x++) {
            if (name.charAt(x) == ' ') {
                c++;
            }
        }
        if (c == 2) {
            res = true;
        }
        return res;
    }*/

}
