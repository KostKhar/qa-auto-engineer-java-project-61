package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public final class Prime {
    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER_EXCLUSIVE = 100;
    private static final Random RANDOM = new Random();
    private static final int THREE = 3;
    private static final int FIVE = 5;
    private static final int SIX = 6;


    private Prime() {
    }

    public static void play(Scanner scanner) {
        String[][] rounds = new String[ROUNDS_COUNT][2];
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            rounds[i] = generateRound();
        }
        Engine.run(RULE, rounds, scanner);
    }

    public static String isPrime(int n) {
        if (n <= 1) {
            return "no";
        }
        if (n <= THREE) {
            return "yes";
        }
        if (n % 2 == 0 || n % THREE == 0) {
            return "no";
        }

        for (int i = FIVE; i * i <= n; i += SIX) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return "no";
            }
        }
        return "yes";
    }

    public static String[] generateRound() {
        int number = RANDOM.nextInt(MAX_RANDOM_NUMBER_EXCLUSIVE);
        return new String[]{Integer.toString(number), isPrime(number)};
    }
}
