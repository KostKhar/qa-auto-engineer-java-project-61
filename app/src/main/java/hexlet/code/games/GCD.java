package hexlet.code.games;

import java.util.Random;

public final class GCD  {
    private static final String RULE = "Find the greatest common divisor of given numbers.";
    private static final Random RANDOM = new Random();

    public String getRules() {
        return RULE;
    }

    public static String[] generateRound() {
        int number = RANDOM.nextInt(1, 10);
        int number1 = number * RANDOM.nextInt(1, 7);
        int number2 = number * RANDOM.nextInt(1, 8);
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

    private GCD() {
    }

}
