package hexlet.code;

import hexlet.code.games.Game;
import hexlet.code.games.Round;

import java.util.ResourceBundle;
import java.util.Scanner;

import static hexlet.code.Cli.helloPlayerInGame;

public final class Engine {
    private static final int ROUNDS_COUNT = 3;
    private static final Scanner scanner = new Scanner(System.in);
    private static final ResourceBundle MESSAGES = ResourceBundle.getBundle("messages");

    private Engine() {
    }

    public static void run(Game game) {
        String gamerName = helloPlayerInGame();
        System.out.println(game.getRules());
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            Round round = game.generateRound();
            System.out.println(MESSAGES.getString("engine.question") + round.getQuestion());
            String answer = scanner.nextLine().trim().toLowerCase();
            System.out.println(MESSAGES.getString("engine.your_answer") + answer);
            if (answer.equals(round.getCorrectAnswer())) {
                System.out.println(MESSAGES.getString("engine.correct"));
            } else {
                System.out.printf((MESSAGES.getString("engine.invalid")), answer, round.getCorrectAnswer(), gamerName);
                return;
            }
        }
        System.out.printf(MESSAGES.getString("engine.congratulations"), gamerName);
    }
}
