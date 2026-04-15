package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class Engine {

    private static final int MAX_ROUNDS = 3;

    public static void run(GameId gameId, String gamerName, Scanner scanner) {
        System.out.println(getRules(gameId));

        for (int i = 0; i < MAX_ROUNDS; i++) {
            String[] round = generateRound(gameId);
            String question = round[0];
            String correctAnswer = round[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(.");
                System.out.println("Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + gamerName + "!");
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + gamerName + "!");
    }

    private static String getRules(GameId gameId) {
        return switch (gameId) {
            case EVEN -> Even.getRules();
            case CALC -> Calc.getRules();
            case GCD -> GCD.getRules();
            case PRIME -> Prime.getRules();
            case PROGRESSION -> Progression.getRules();
        };
    }

    private static String[] generateRound(GameId gameId) {
        return switch (gameId) {
            case EVEN -> Even.generateRound();
            case CALC -> Calc.generateRound();
            case GCD -> GCD.generateRound();
            case PRIME -> Prime.generateRound();
            case PROGRESSION -> Progression.generateRound();
        };
    }

    public enum GameId {
        EVEN,
        CALC,
        GCD,
        PRIME,
        PROGRESSION
    }
}
