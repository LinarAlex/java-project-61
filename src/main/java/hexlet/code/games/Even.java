package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static final int LIMIT = 101;
    public static void gameEven() {
        Engine.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int maxCount = 3;
        int field = 2;
        int count = 0;
        Random random = new Random();
        String[][] arrayRound = new String[maxCount][field];
        while (count < maxCount) {
            for (int i = 0; i < maxCount; i++) {
                int randomNumber = random.nextInt(LIMIT);
                arrayRound[i][0] = Integer.toString(randomNumber);
                arrayRound[i][1] = (randomNumber % 2 == 0) ? "yes" : "no";
            }
            count++;
        }
        Engine.userInteraction(arrayRound);
    }
}
