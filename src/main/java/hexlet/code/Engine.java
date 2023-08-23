package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static int menu() {
        int gameNumber0 = 0;
        int gameNumber1 = 1;
        int gameNumber2 = 2;
        int gameNumber3 = 3;
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(gameNumber1 + " - Greet");
        System.out.println(gameNumber2 + " - Even");
        System.out.println(gameNumber3 + " - Calc");
        System.out.println(gameNumber0 + " - Exit");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static String userName;
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

    public static void congratulation() {
        System.out.println("Congratulation " + getUserName() + " !");
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 100);
    }
}
