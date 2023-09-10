package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUNDS = 3;
    public static final int FIELDS = 2;
    public static final int LIMIT = 101;
    public static final int FIRST_POINT = 5;
    public static final int LAST_POINT = 11;
    public static final int DIFFERENCE = 10;
    private static String userName;
    public static String name() {
        Scanner scanner = new Scanner(System.in);
        userName = scanner.nextLine();
        return userName;
    }
    public static String getUserName() {
        return userName;
    }

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String playerName = Engine.name();
        System.out.println("Hello, " + playerName + "!");
    }
    public static void userInteraction(String[][] arrayRound) {
        greet();
        Scanner scanner = new Scanner(System.in);
        int round = 0;
        while (round < MAX_ROUNDS) {
            System.out.println("Question: " + arrayRound[round][0]);
            System.out.print("Your answer: ");
            String playerAnswer = scanner.next();
            if (Engine.checkAnswer(playerAnswer.equals(arrayRound[round][1]), arrayRound[round][1], playerAnswer)) {
                break;
            }
            round += 1;
            Engine.congratulation(round == MAX_ROUNDS);
        }
    }
    public static boolean checkAnswer(boolean check, Object rightAnswer, Object playerAnswer) {
        if (check) {
            System.out.println("Correct!");
        } else {
            System.out.print("'" + playerAnswer + "'" + " is wrong answer ;(.");
            System.out.println(" Correct answer was '" + rightAnswer + "'.");
            System.out.println("Let's try again, " + getUserName() + "!");
            return true;
        }
        return false;
    }

    public static void congratulation(boolean condition) {
        if (condition) {
            System.out.println("Congratulations, " + getUserName() + "!");
        }
    }
}
