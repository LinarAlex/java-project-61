package hexlet.code;
import java.util.Scanner;


public class Even {
    public static void gameEven() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int count = 0;
            while (count < 3) {
                int getRandomNumber = (int) (Math.random() * 100);
                System.out.println("Question: " + getRandomNumber);
                System.out.print("Your answer: ");
                String playerAnswer = scanner.nextLine();
                if ((getRandomNumber % 2 == 0) & playerAnswer.equals("yes")) {
                    System.out.println("Correct");
                    count++;
                } else
                    if ((getRandomNumber % 2 !=0) & playerAnswer.equals("no")) {
                        System.out.println("Correct");
                        count++;
                    }
                if ((getRandomNumber % 2 == 0) & !(playerAnswer.equals("yes"))) {
                    System.out.println(playerAnswer + " is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + userName);
                    break;
                } else if ((getRandomNumber % 2 !=0) & !(playerAnswer.equals("no"))) {
                    System.out.println(playerAnswer + " is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + userName);
                    break;
                }
            }
       if (count == 3) {
           System.out.println("Congratulations! " + userName);
       }
    }


}
