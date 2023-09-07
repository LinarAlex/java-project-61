package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static final int LIMIT = 101;
    public static void gameCalc() {
        Engine.greet();
        System.out.println("What is the result of the expression?");
        String[] operators = {"+", "-", "*"};
        int maxRound = 3;
        int field = 2;
        int count = 0;
        Random random = new Random();
        String[][] arrayRound = new String[maxRound][field];
        while (count < maxRound) {
            for (int i = 0; i < maxRound; i++) {
                int num1 = random.nextInt(LIMIT);
                int num2 = random.nextInt(LIMIT);
                String randomExpression = operators[getRandomIndex(operators)];
                arrayRound[i][0] = num1 + " " + randomExpression + " " + num2;
                arrayRound[i][1] = checkAnswer(randomExpression, num1, num2);
            }
            count++;
        } Engine.userInteraction(arrayRound);
    }

    public static int getRandomIndex(String[] operator) {
        return new Random().nextInt(operator.length);
    }

    public static String checkAnswer(String randomExpression, int num1, int num2) {
        int result = switch (randomExpression) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            default -> 0;
        };
        return Integer.toString(result);
    }
}
