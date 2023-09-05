package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class Progression {
    public static void gameProgression() {
        Engine.greet();
        System.out.println("What number is missing in the progression?");
        int maxCount = 3;
        int field = 2;
        int count = 0;
        Random random = new Random();
        String[][] arrayRound = new String[maxCount][field];
        while (count < maxCount) {
            for (int i = 0; i < maxCount; i++) {
                int progressionLength = random.nextInt(5, 11);
                int difference = random.nextInt(10);
                int starProgression = random.nextInt(101);
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
