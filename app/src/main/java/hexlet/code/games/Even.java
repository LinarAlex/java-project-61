package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void initiateEven() {
        String[][] arrayRound = new String[Engine.MAX_ROUNDS][Engine.FIELDS];
        for (int count = 0; count < Engine.MAX_ROUNDS; count++) {
            for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
                int randomNumber = Utils.getRandomNumber(Engine.LIMIT);
                arrayRound[i][0] = Integer.toString(randomNumber);
                arrayRound[i][1] = checkEven(randomNumber) ? "yes" : "no";
            }
        }
        Engine.getGameLogic(arrayRound, RULES);
    }
    public static boolean checkEven(int number) {
        return (number % 2 == 0);
    }
}
