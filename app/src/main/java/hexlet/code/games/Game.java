package hexlet.code.games;


import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;

public abstract class Game {
    protected static final ResourceBundle MESSAGES =
            ResourceBundle.getBundle("messages");
    protected final Scanner scanner = new Scanner(System.in);
    protected final Random random = new Random();

    int codeGame;

    protected Game() {
    }

    protected int getCode() {
        return codeGame;
    }

    protected String playGame(String gamerName) {
        for (int i = 0; i < 3; i++) {
            int number = random.nextInt();
            System.out.println(MESSAGES.getString("game.rule"));
            System.out.println(MESSAGES.getString("game.question") + number);

            String answer = scanner.nextLine().trim().toLowerCase();
            System.out.println(MESSAGES.getString("game.your_answer") + answer);

            boolean isEven = number % 2 == 0;

            if ((answer.equals("yes") && isEven) || (answer.equals("no") && !isEven)) {
                System.out.println(MESSAGES.getString("game.correct"));
            } else {
                String correct = isEven ? "yes" : "no";
                return String.format(MESSAGES.getString("game.invalid"), answer, correct, gamerName);
            }
        }
        return MESSAGES.getString("game.congratulations") +" ,"+ gamerName;
    }


}
