package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final String TEXT = "What is the result of the expression?";
    public static final int LIMIT = 101;

    public static void initiateCalc() {
        String[] operators = {"+", "-", "*"};
        String[][] arrayRound = new String[Engine.MAX_ROUNDS][Engine.FIELDS];
        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int num1 = Utils.getRandomNumber(LIMIT);
            int num2 = Utils.getRandomNumber(LIMIT);
            String randomExpression = operators[Utils.getRandomNumber(0, operators.length)];
            arrayRound[i][0] = num1 + " " + randomExpression + " " + num2;
            arrayRound[i][1] = Integer.toString(calculate(randomExpression, num1, num2));
        }
        Engine.getGameLogic(arrayRound, TEXT);
    }

    private static int calculate(String randomExpression, int num1, int num2) {
        return switch (randomExpression) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            default -> 0;
        };
    }
}
