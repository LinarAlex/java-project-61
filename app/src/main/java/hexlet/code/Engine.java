package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static int menu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(" 1 - Greet");
        System.out.println(" 2 - Even");
        System.out.println(" 3 - Calc");
        System.out.println(" 4 - GCD");
        System.out.println(" 5 - Progression");
        System.out.println(" 6 - Prime");
        System.out.println(" 0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
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
        Scanner scanner = new Scanner(System.in);
        final int maxRound = 3;
        int round = 0;
        while (round < maxRound) {
            System.out.println("Question: " + arrayRound[round][0]);
            System.out.print("Your answer: ");
            String playerAnswer = scanner.next();
            if (Engine.checkAnswer(playerAnswer.equals(arrayRound[round][1]), arrayRound[round][1], playerAnswer)) {
                break;
            }
            round += 1;
            Engine.congratulation(round == maxRound);
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
