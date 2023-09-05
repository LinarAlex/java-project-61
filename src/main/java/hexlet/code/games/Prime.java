package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static void gamePrime() {
        Engine.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int maxCount = 3;
        int field = 2;
        int count = 0;
        Random random = new Random();
        String[][] arrayRound = new String[maxCount][field];
        while (count < maxCount) {
            for (int i = 0; i < maxCount; i++) {
                int randomNumber = random.nextInt(101);
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
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        } return true;
    }
}


