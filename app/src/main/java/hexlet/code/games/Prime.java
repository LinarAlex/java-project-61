package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static final int LIMIT = 101;
    public static void gamePrime() {
        Engine.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int maxRound = 3;
        int field = 2;
        int count = 0;
        Random random = new Random();
        String[][] arrayRound = new String[maxRound][field];
        while (count < maxRound) {
            for (int i = 0; i < maxRound; i++) {
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


