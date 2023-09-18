package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {
    public static final String RULES = "What number is missing in the progression?";
    public static final int LIMIT = 101;

    public static void initiateProgression() {
        String[][] arrayRound = new String[Engine.MAX_ROUNDS][Engine.FIELDS];
        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            String[] stringOfProgression = createProgression();
            int randomIndex = Utils.getRandomNumber(0, stringOfProgression.length);
            arrayRound[i][1] = stringOfProgression[randomIndex];
            stringOfProgression[randomIndex] = "..";
            arrayRound[i][0] = String.join(" ", stringOfProgression);
        }
        Engine.getGameLogic(arrayRound, RULES);
    }

    private static String[] createProgression() {
        int progressionLength = Utils.getRandomNumber(Engine.FIRST_POINT, Engine.LAST_POINT);
        int difference = Utils.getRandomNumber(0, Engine.DIFFERENCE);
        int starProgression = Utils.getRandomNumber(0, LIMIT);
        String[] array = new String[progressionLength];
        for (int j = 0; j < array.length; j++) {
            array[j] = String.valueOf(starProgression + (j * difference));
        }
        return array;
    }
}
