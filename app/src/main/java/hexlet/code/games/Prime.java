package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static final int LIMIT = 101;
    public static final int MAX_COUNT = 3;
    public static void gamePrime() {
        Engine.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int field = 2;
        int count = 0;
        Random random = new Random();
        String[][] arrayRound = new String[MAX_COUNT][field];
        while (count < MAX_COUNT) {
            for (int i = 0; i < MAX_COUNT; i++) {
                int randomNumber = random.nextInt(LIMIT);
                arrayRound[i][0] = Integer.toString(randomNumber);
                arrayRound[i][1] = isPrime(randomNumber) ? "yes" : "no";
            }
            count++;
        }
        Engine.userInteraction(arrayRound);
    }
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        } return true;
    }
}


