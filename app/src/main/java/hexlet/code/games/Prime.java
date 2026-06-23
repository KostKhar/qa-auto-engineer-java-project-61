package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

import java.util.Scanner;

public final class Prime {
    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_RANDOM_NUMBER_EXCLUSIVE = 100;

    private Prime() {
    }

    public static void play(Scanner scanner) {
        Engine.run(RULE, Prime::generateRound, scanner);
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    private static String[] generateRound() {
        int number = RandomUtils.getRandomInt(MAX_RANDOM_NUMBER_EXCLUSIVE);
        String correctAnswer = isPrime(number) ? "yes" : "no";
        return new String[]{Integer.toString(number), correctAnswer};
    }
}
