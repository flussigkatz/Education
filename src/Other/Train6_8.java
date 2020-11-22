package Other;

import java.util.Arrays;

public class Train6_8 {
    public static void main(String[] args) {
        int[] array = {0, 4, 3, 0, 6, 10, 340, 5, 6, 0, 25, 0, 8, 7, 3, 44, 1, 1, 0, 6, 4};
        printInLine(moveZeros(array));
    }

    private static int[] moveZeros(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] == 0) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    private static void printInLine(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result = result + array[i] + " "; //Конкатенация строк
        }
        System.out.println(result);
    }
}
