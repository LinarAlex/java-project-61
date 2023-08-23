package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;


public class Even {
    public static void gameEven() {
        Scanner scanner = new Scanner(System.in);
        Engine.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int count = 0;
        while (count < 3) {
            int randomNumber = Engine.getRandomNumber();
            String rightAnswer = (randomNumber % 2 == 0) ? "yes" : "no";
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String playerAnswer = scanner.nextLine();
            if (Engine.checkAnswer(rightAnswer.equals(playerAnswer), rightAnswer, playerAnswer)) {
                break;
            }
            count++;
        }
        if (count == 3) {
            Engine.congratulation();
        }
    }
}
