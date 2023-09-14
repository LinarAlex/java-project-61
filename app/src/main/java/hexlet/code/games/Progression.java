package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {
    public static final String RULES = "What number is missing in the progression?";

    public static void initiateProgression() {
        String[][] arrayRound = new String[Engine.MAX_ROUNDS][Engine.FIELDS];
        for (int count = 0; count < Engine.MAX_ROUNDS; count++) {
            for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
                String[] stringOfProgression = createProgression();
                int randomIndex = Utils.getRandomNumber(stringOfProgression.length);
                arrayRound[i][1] = stringOfProgression[randomIndex];
                stringOfProgression[randomIndex] = "..";
                arrayRound[i][0] = String.join(" ", stringOfProgression);
            }
        }
        Engine.getGameLogic(arrayRound, RULES);
    }
    public static String[] createProgression() {
        int progressionLength = Utils.getRandomNumber(Engine.FIRST_POINT, Engine.LAST_POINT);
        int difference = Utils.getRandomNumber(Engine.DIFFERENCE);
        int starProgression = Utils.getRandomNumber(Engine.LIMIT);
        int[] array = new int[progressionLength];
        for (int j = 0; j < array.length; j++) {
            array[j] = starProgression + (j * difference);
        }
        String[] stringOfProgression = new String[progressionLength];
        for (int k = 0; k < progressionLength; k++) {
            stringOfProgression[k] = String.valueOf(array[k]);
        }
        return stringOfProgression;
    }
}
