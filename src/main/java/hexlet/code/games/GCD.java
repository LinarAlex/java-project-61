package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {
    public static void gameGCD() {
        Scanner scanner = new Scanner(System.in);
        Engine.greet();
        System.out.println("Find the greatest common divisor of given numbers.");
        int count = 0;
        while (count < 3) {
            int num1 = Engine.getRandomNumber();
            int num2 = Engine.getRandomNumber();
            System.out.println("Question: " + num1 + " " + num2);
            System.out.print("Your answer: ");
            int playerAnswer = scanner.nextInt();
            int rightAnswer = getGCD(num1, num2);
            if (Engine.checkAnswer(rightAnswer == playerAnswer, rightAnswer, playerAnswer)) {
                break;
            }
            count++;
        }
        if (count == 3) {
            Engine.congratulation();
        }

    }
    public static int getGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            while (num2 != 0) {
                int temp = num1 % num2;
                num1 = num2;
                num2 = temp;
            }
        }
        return num1;
    }
}
