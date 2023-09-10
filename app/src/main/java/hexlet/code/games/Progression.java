package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class Progression {
    public static final int FIRSTPOINT = 5;
    public static final int LASTPOINT = 11;
    public  static final int DIFFERENCE = 10;
    public static final int LIMIT = 101;
    public static final int MAX_COUNT = 3;
    public static void gameProgression() {
        Engine.greet();
        System.out.println("What number is missing in the progression?");
        int field = 2;
        int count = 0;
        Random random = new Random();
        String[][] arrayRound = new String[MAX_COUNT][field];
        while (count < MAX_COUNT) {
            for (int i = 0; i < MAX_COUNT; i++) {
                int progressionLength = random.nextInt(FIRSTPOINT, LASTPOINT);
                int difference = random.nextInt(DIFFERENCE);
                int starProgression = random.nextInt(LIMIT);
                int[] array = new int[progressionLength];
                for (int j = 0; j < array.length; j++) {
                    array[j] = starProgression + (j * difference);
                }
                int randomIndex = random.nextInt(progressionLength);
                String[] stringOfProgression = new String[progressionLength];
                for (int k = 0; k < progressionLength; k++) {
                    stringOfProgression[k] = String.valueOf(array[k]);
                }
                arrayRound[i][1] = stringOfProgression[randomIndex];
                stringOfProgression[randomIndex] = "..";
                arrayRound[i][0] = String.join(" ", stringOfProgression);
            }
            count++;
        }
        Engine.userInteraction(arrayRound);
    }
}
