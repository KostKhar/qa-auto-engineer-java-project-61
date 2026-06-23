package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

import java.util.Scanner;

public final class Calc {
    private static final String RULE = "What is the result of the expression?";
    private static final int MAX_RANDOM_NUMBER_EXCLUSIVE = 10;
    private static final char[] OPERATIONS = {'+', '-', '*'};

    private Calc() {
    }

    public static void play(Scanner scanner) {
        Engine.run(RULE, Calc::generateRound, scanner);
    }

    private static String[] generateRound() {
        int a = RandomUtils.getRandomInt(MAX_RANDOM_NUMBER_EXCLUSIVE);
        int b = RandomUtils.getRandomInt(MAX_RANDOM_NUMBER_EXCLUSIVE);
        char op = RandomUtils.getRandomChar(OPERATIONS);
        int result = calculate(a, b, op);
        return new String[]{a + " " + op + " " + b, String.valueOf(result)};
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
