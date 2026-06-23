package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

import java.util.Scanner;

public final class Even {
    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_RANDOM_NUMBER_EXCLUSIVE = 100;

    private Even() {
    }

    public static void play(Scanner scanner) {
        Engine.run(RULE, Even::generateRound, scanner);
    }

    private static String[] generateRound() {
        int number = RandomUtils.getRandomInt(MAX_RANDOM_NUMBER_EXCLUSIVE);
        String correctAnswer = (number % 2 == 0) ? "yes" : "no";
        return new String[]{String.valueOf(number), correctAnswer};
    }
}
