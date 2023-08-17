package hexlet.code;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int gameNumber0 = 0;
        int gameNumber1 = 1;
        int gameNumber2 = 2;
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(gameNumber1 + " - Greet");
        System.out.println(gameNumber2 + " - Even");
        System.out.println(gameNumber0 + " - Exit");
        Scanner scanner = new Scanner(System.in);
        int gameChoice = scanner.nextInt();
        if (gameChoice == gameNumber1) {
            Cli.askName();
        }
        if (gameChoice == gameNumber2) {
            Even.gameEven();
        }
    }

}
