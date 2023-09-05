package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static void main(String[] args) {
        int gameChoice = Engine.menu();
        switch (gameChoice) {
            case 1 -> Cli.askName();
            case 2 -> Even.gameEven();
            case 3 -> Calc.gameCalc();
            case 4 -> GCD.gameGCD();
            case 5 -> Progression.gameProgression();
            case 6 -> Prime.gamePrime();
            default -> System.out.println("exit");
        }
    }

}
