package hexlet.code.games;

import java.util.Random;

public final class GCD {
    private static final String RULE = "Find the greatest common divisor of given numbers.";
    private static final Random RANDOM = new Random();
    private static final int MAX_STEP = 8;
    private static final int MIN_STEP = 1;

    private GCD() {
    }

    public static String[] generateRound() {
        int number = RANDOM.nextInt(MIN_STEP, MAX_STEP);
        int number1 = number * RANDOM.nextInt(MIN_STEP, MAX_STEP);
        int number2 = number * RANDOM.nextInt(MIN_STEP, MAX_STEP);
        return new String[]{number1 + " " + number2, gcd(number1, number2).toString()};
    }

    private static Integer gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static String getRules() {
        return RULE;
    }

}
