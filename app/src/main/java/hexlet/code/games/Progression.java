package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class Progression {

    public static void gameProgression() {
      //  Engine.greet();
        System.out.println("What number is missing in the progression?");
        Random random = new Random();
        String[][] arrayRound = new String[Engine.MAX_ROUNDS][Engine.FIELDS];
        for (int count = 0; count < Engine.MAX_ROUNDS; count++) {
            for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
                int progressionLength = random.nextInt(Engine.FIRST_POINT, Engine.LAST_POINT);
                int difference = random.nextInt(Engine.DIFFERENCE);
                int starProgression = random.nextInt(Engine.LIMIT);
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
        }
        Engine.userInteraction(arrayRound);
    }
}
