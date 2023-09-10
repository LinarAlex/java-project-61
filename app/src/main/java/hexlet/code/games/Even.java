package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static final int LIMIT = 101;
    public static final int MAX_COUNT = 3;
    public static void gameEven() {
        Engine.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int field = 2;
        int count = 0;
        Random random = new Random();
        String[][] arrayRound = new String[MAX_COUNT][field];
        while (count < MAX_COUNT) {
            for (int i = 0; i < MAX_COUNT; i++) {
                int randomNumber = random.nextInt(LIMIT);
                arrayRound[i][0] = Integer.toString(randomNumber);
                arrayRound[i][1] = (randomNumber % 2 == 0) ? "yes" : "no";
            }
            count++;
        }
        Engine.userInteraction(arrayRound);
    }
}
