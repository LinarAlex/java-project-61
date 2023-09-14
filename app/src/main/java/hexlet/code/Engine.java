package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUNDS = 3;
    public static final int FIELDS = 2;
    public static final int LIMIT = 101;
    public static final int FIRST_POINT = 5;
    public static final int LAST_POINT = 11;
    public static final int DIFFERENCE = 10;

    public static void getGameLogic(String[][] arrayRound, String rules) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);
        int round = 0;
        while (round < MAX_ROUNDS) {
            System.out.println("Question: " + arrayRound[round][0]);
            System.out.print("Your answer: ");
            String playerAnswer = scanner.next();
            if (playerAnswer.equals(arrayRound[round][1])) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + playerAnswer + "'" + " is wrong answer ;(.");
                System.out.println(" Correct answer was '" + arrayRound[round][1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            round++;
            if (round == MAX_ROUNDS) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
