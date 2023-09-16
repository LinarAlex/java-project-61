package hexlet.code;

import java.util.Random;

public class Utils {

    public static int getRandomNumber(int lowBound, int upBound) {
        Random random = new Random();
        return random.nextInt(lowBound, upBound);
    }
}
