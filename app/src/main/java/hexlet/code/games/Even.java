package hexlet.code.games;

import java.util.Random;

public final class Even {
    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_RANDOM_NUMBER_EXCLUSIVE = 100;
    private static final Random RANDOM = new Random();

    private Even() {
    }

    public static String getRules() {
        return RULE;
    }

    public static String[] generateRound() {
        int number = RANDOM.nextInt(MAX_RANDOM_NUMBER_EXCLUSIVE);
        String correctAnswer = (number % 2 == 0) ? "yes" : "no";
        return new String[]{String.valueOf(number), correctAnswer};
    }
}
