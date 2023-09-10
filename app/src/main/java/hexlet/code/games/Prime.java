package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;

public class Prime {

    public static void gamePrime() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Random random = new Random();
        String[][] arrayRound = new String[Engine.MAX_ROUNDS][Engine.FIELDS];
        for (int count = 0; count < Engine.MAX_ROUNDS; count++) {
            for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
                int randomNumber = random.nextInt(Engine.LIMIT);
                arrayRound[i][0] = Integer.toString(randomNumber);
                arrayRound[i][1] = isPrime(randomNumber) ? "yes" : "no";
            }
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


