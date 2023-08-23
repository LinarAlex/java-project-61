package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;

public class App {
    public static void main(String[] args) {
        int gameChoice = Engine.menu();
        switch (gameChoice) {
            case 1 -> Cli.askName();
            case 2 -> Even.gameEven();
            case 3 -> Calc.gameCalc();
            default -> System.out.println("exit");
        }
    }

}
