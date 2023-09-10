package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static void gameEven() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random random = new Random();
        String[][] arrayRound = new String[Engine.MAX_ROUNDS][Engine.FIELDS];
        for (int count = 0; count < Engine.MAX_ROUNDS; count++) {
            for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
                int randomNumber = random.nextInt(Engine.LIMIT);
                arrayRound[i][0] = Integer.toString(randomNumber);
                arrayRound[i][1] = (randomNumber % 2 == 0) ? "yes" : "no";
            }
        }
        Engine.userInteraction(arrayRound);
    }
}
