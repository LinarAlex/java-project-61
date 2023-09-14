package hexlet.code;

import java.util.Random;

public class Utils {
    public static int getRandomNumber(int bound1) {
        Random random = new Random();
        return random.nextInt(bound1);
    }
    public static int getRandomNumber(int bound1, int bound2) {
        Random random = new Random();
        return random.nextInt(bound1, bound2);
    }
}
