package hexlet.code;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int gameNumber1 = 1;
        int gameNumber0 = 0;
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(gameNumber1 + " - Greet");
        System.out.println(gameNumber0 + " - Exit");
        Scanner scanner = new Scanner(System.in);
        int gameChoice = scanner.nextInt();
        if (gameChoice == gameNumber1) {
            System.out.println("Welcome to the Brain Games!");
            Cli.askName();
            Greet.gameGreetStart("Bill");
        }
        scanner.close();
    }
}
