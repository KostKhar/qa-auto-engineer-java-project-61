package hexlet.code.games;

import java.util.Random;

public final class Calc {
    private static final String RULE = "What is the result of the expression?";
    private static final int MAX_RANDOM_NUMBER_EXCLUSIVE = 10;
    private static final Random RANDOM = new Random();
    private static final char[] OPERATIONS = {'+', '-', '*'};

    private Calc() {
    }

    public static String getRules() {
        return RULE;
    }

    public static String[] generateRound() {
        int a = RANDOM.nextInt(MAX_RANDOM_NUMBER_EXCLUSIVE);
        int b = RANDOM.nextInt(MAX_RANDOM_NUMBER_EXCLUSIVE);
        char op = randomOperation();
        int result = calculate(a, b, op);
        return new String[]{a + " " + op + " " + b, String.valueOf(result)};
    }

    private static char randomOperation() {
        return OPERATIONS[RANDOM.nextInt(OPERATIONS.length)];
    }

    private static int calculate(int a, int b, char op) {
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> throw new IllegalArgumentException("Invalid math symbol");
        };
    }
}
