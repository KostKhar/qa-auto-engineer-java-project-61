package hexlet.code.game;

import java.util.Random;
import java.util.Scanner;

public class EvenNumber extends Game {
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();

    public EvenNumber() {
        super();
    }

    public int getCode() {
        int codeGame = 1;
        return codeGame;
    }

    public String getAnswer(String gamerName) {

        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(100);
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine().trim().toLowerCase();

            boolean isEven = number % 2 == 0;

            if ((answer.equals("yes") && isEven) || (answer.equals("no") && !isEven)) {
                System.out.println("Correct!");
            } else {
                String correct = isEven ? "yes" : "no";
                return "'" + answer + "' is wrong answer ;(. Correct answer was '" + correct
                        + "'.\nLet's try again, " + gamerName + "!";
            }
        }
        return "Congratulations!";
    }

}
