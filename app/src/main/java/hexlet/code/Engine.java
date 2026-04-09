package hexlet.code;

import hexlet.code.games.Game;
import hexlet.code.games.Round;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;

import static hexlet.code.Cli.helloPlayerInGame;

public final class Engine {
    private static final int ROUNDS_COUNT = 3;
    private static final Scanner scanner = new Scanner(System.in);
    private static final ResourceBundle MESSAGES = ResourceBundle.getBundle("messages");

    public static void run(Game game) {
        String gamerName = helloPlayerInGame();
        System.out.println(game.getRules());
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            Round round = game.generateRound();
            System.out.println(round.getQuestion());
            String answer = scanner.nextLine();
            if(answer.equals(round.getCorrectAnswer())){
                System.out.println("Correct!");
            } else{
                System.out.println(String.format(MESSAGES.getString("even.invalid"), answer, round.getCorrectAnswer(), gamerName));
                return;
            }
            System.out.println("Congratulations, "+ gamerName + "!");
        }
    }
}
