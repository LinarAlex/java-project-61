package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {
    public static final String RULES = "What number is missing in the progression?";
    public static final int LIMIT = 101;
    public static final int FIRST_POINT = 5;
    public static final int LAST_POINT = 11;
    public static final int DIFFERENCE = 10;

    public static void initiateProgression() {
        String[][] arrayRound = new String[Engine.MAX_ROUNDS][Engine.FIELDS];
        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int progressionLength = Utils.getRandomNumber(FIRST_POINT, LAST_POINT);
            int difference = Utils.getRandomNumber(DIFFERENCE);
            int startProgression = Utils.getRandomNumber(LIMIT);
            String[] stringOfProgression = createProgression(progressionLength, startProgression, difference);
            int randomIndex = Utils.getRandomNumber(stringOfProgression.length);
            arrayRound[i][1] = stringOfProgression[randomIndex];
            stringOfProgression[randomIndex] = "..";
            arrayRound[i][0] = String.join(" ", stringOfProgression);
        }
        Engine.getGameLogic(arrayRound, RULES);
    }

    private static String[] createProgression(int progressionLength, int startProgression, int difference) {
        String[] array = new String[progressionLength];
        for (int j = 0; j < array.length; j++) {
            array[j] = String.valueOf(startProgression + (j * difference));
        }
        return array;
    }
}
