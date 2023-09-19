package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;



public class Prime {
    public static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int LIMIT = 101;

    public static void initiatePrime() {
        String[][] arrayRound = new String[Engine.MAX_ROUNDS][Engine.FIELDS];
        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int randomNumber = Utils.getRandomNumber(LIMIT);
            arrayRound[i][0] = Integer.toString(randomNumber);
            arrayRound[i][1] = isPrime(randomNumber) ? "yes" : "no";
        }
        Engine.getGameLogic(arrayRound, RULES);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}


