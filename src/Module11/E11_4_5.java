package Module11;

import java.util.Map;
import java.util.Optional;
import java.util.Random;

public class E11_4_5 {

    public static String guessWin (int guess) {
        String f = (guess <= 4) && (guess >= 2) ? "Win!" : null;
        Optional<String> win = Optional.ofNullable(f);
        return win.orElse("null");
    }

    public static int guessGen () {
        Random random = new Random();
        return random.nextInt(5);
    }

    public static void main(String[] args) {
        System.out.println(guessWin(guessGen()));

    }
}
