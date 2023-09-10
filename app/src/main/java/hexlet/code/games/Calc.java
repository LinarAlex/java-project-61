package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Calc {

    public static void gameCalc() {
        System.out.println("What is the result of the expression?");
        String[] operators = {"+", "-", "*"};
        Random random = new Random();
        String[][] arrayRound = new String[Engine.MAX_ROUNDS][Engine.FIELDS];
        for (int count = 0; count < Engine.MAX_ROUNDS; count++) {
            for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
                int num1 = random.nextInt(Engine.LIMIT);
                int num2 = random.nextInt(Engine.LIMIT);
                String randomExpression = operators[getRandomIndex(operators)];
                arrayRound[i][0] = num1 + " " + randomExpression + " " + num2;
                arrayRound[i][1] = checkAnswer(randomExpression, num1, num2);
            }
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
