package hexlet.code.games;

import java.util.Random;

public final class Prime {
    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_RANDOM_NUMBER_EXCLUSIVE = 100;
    private static final Random RANDOM = new Random();

    private Prime() {
    }

    public static String isPrime(int n) {
        if (n <= 1) {
            return "no";
        }
        if (n <= 3) {
            return "yes";
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return "no";
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return "no";
        }
        return "yes";
    }

    public static String getRules() {
        return RULE;
    }

    public static String[] generateRound() {
        int number = RANDOM.nextInt(MAX_RANDOM_NUMBER_EXCLUSIVE);
        return new String[]{Integer.toString(number), isPrime(number)};
    }
}
