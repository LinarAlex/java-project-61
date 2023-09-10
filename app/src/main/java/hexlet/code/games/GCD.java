package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class GCD {
    public static final int LIMIT = 101;
    public static final int MAX_COUNT = 3;
    public static void gameGCD() {
        Engine.greet();
        System.out.println("Find the greatest common divisor of given numbers.");
        int field = 2;
        int count = 0;
        Random random = new Random();
        String[][] arrayRound = new String[MAX_COUNT][field];
        while (count < MAX_COUNT) {
            for (int i = 0; i < MAX_COUNT; i++) {
                int num1 = random.nextInt(LIMIT);
                int num2 = random.nextInt(LIMIT);
                arrayRound[i][0] = num1 + " " + num2;
                arrayRound[i][1] = Integer.toString(getGCD(num1, num2));
            }
            count++;
        }
        Engine.userInteraction(arrayRound);
    }
    public static int getGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            while (num2 != 0) {
                int temp = num1 % num2;
                num1 = num2;
                num2 = temp;
            }
        }
        return num1;
    }
}

