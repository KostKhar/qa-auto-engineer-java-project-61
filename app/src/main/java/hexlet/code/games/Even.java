package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public final class Even {
    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER_EXCLUSIVE = 100;
    private static final Random RANDOM = new Random();

    private Even() {
    }

    public static void play(Scanner scanner) {
        String[][] rounds = new String[ROUNDS_COUNT][2];
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            rounds[i] = generateRound();
        }
        Engine.run(RULE, rounds, scanner);
    }

    public static String[] generateRound() {
        int number = RANDOM.nextInt(MAX_RANDOM_NUMBER_EXCLUSIVE);
        String correctAnswer = (number % 2 == 0) ? "yes" : "no";
        return new String[]{String.valueOf(number), correctAnswer};
    }
}
