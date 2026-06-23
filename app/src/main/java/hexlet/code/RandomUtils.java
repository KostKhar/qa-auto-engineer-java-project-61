package hexlet.code;

import java.util.Random;

public final class RandomUtils {
    private static final Random RANDOM = new Random();

    private RandomUtils() {
    }

    public static int getRandomInt(int maxExclusive) {
        return RANDOM.nextInt(maxExclusive);
    }

    public static int getRandomInt(int minInclusive, int maxExclusive) {
        return RANDOM.nextInt(minInclusive, maxExclusive);
    }

    public static char getRandomChar(char[] values) {
        return values[getRandomInt(values.length)];
    }
}
