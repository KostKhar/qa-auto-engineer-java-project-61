package hexlet.code.game;

import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;

public class EvenNumber extends Game {
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();
    private static final ResourceBundle MESSAGES =
            ResourceBundle.getBundle("messages");

    public EvenNumber() {
        super();
    }

    public int getCode() {
        codeGame = 2;
        return codeGame;
    }

    public String getAnswer(String gamerName) {

        for (int i = 0; i < 3; i++) {
            int number = random.nextInt();
            System.out.println(MESSAGES.getString("even.rule"));
            System.out.println(MESSAGES.getString("even.question") + number);

            String answer = scanner.nextLine().trim().toLowerCase();
            System.out.println(MESSAGES.getString("even.your_answer") + answer);

            boolean isEven = number % 2 == 0;

            if ((answer.equals("yes") && isEven) || (answer.equals("no") && !isEven)) {
                System.out.println(MESSAGES.getString("even.correct"));
            } else {
                String correct = isEven ? "yes" : "no";
                return String.format(MESSAGES.getString("even.invalid"), answer, correct, gamerName);
            }
        }
        return MESSAGES.getString("even.congratulations");
    }



}
