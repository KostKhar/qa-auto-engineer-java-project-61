package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

import java.util.Scanner;

public final class GCD {
    private static final String RULE = "Find the greatest common divisor of given numbers.";
    private static final int MAX_STEP = 8;
    private static final int MIN_STEP = 1;

    private GCD() {
    }

    public static void play(Scanner scanner) {
        Engine.run(RULE, GCD::generateRound, scanner);
    }

    private static String[] generateRound() {
        int number = RandomUtils.getRandomInt(MIN_STEP, MAX_STEP);
        int number1 = number * RandomUtils.getRandomInt(MIN_STEP, MAX_STEP);
        int number2 = number * RandomUtils.getRandomInt(MIN_STEP, MAX_STEP);
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

}
