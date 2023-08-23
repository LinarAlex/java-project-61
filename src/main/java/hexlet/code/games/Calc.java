package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;

public class Calc {
    public static void gameCalc() {
        Scanner scanner = new Scanner(System.in);
        Engine.greet();
        System.out.println("What is the result of the expression?");
        String[] operators = {"+", "-", "*"};
        int count = 0;
        while (count < 3) {
            int num1 = Engine.getRandomNumber();
            int num2 = Engine.getRandomNumber();
            String randomExpression = operators[getRandomIndex(operators)];
            System.out.println("Question: " + num1 + " " + randomExpression + " " + num2);
            System.out.print("Your answer: ");
            int playerAnswer = scanner.nextInt();
            int rightAnswer = checkAnswer(num1, num2, randomExpression);
            if (Engine.checkAnswer(rightAnswer == playerAnswer, rightAnswer, playerAnswer)) {
                break;
            }
            count++;
        }
        if (count == 3) {
            Engine.congratulation();
        }
    }
    public static int getRandomIndex(String[] operator) {
        return new Random().nextInt(operator.length);
    }

    public static int checkAnswer(int num1, int num2, String randomExp) {
        return switch (randomExp) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            default -> 0;
        };
    }
}
