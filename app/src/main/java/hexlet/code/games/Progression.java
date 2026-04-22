package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public final class Progression {
    private static final String RULE = "What number is missing in the progression?";
    private static final int MAX_RANDOM_NUMBER_EXCLUSIVE = 100;
    private static final Random RANDOM = new Random();

    private Progression() {
    }

    public static String[] generateRound() {
        List<Integer> progression = generateProgression();
        int missingIndex = RANDOM.nextInt(progression.size());
        int missingNumber = progression.get(missingIndex);
        progression.set(missingIndex, null);

        String question = progression.stream()
                .map(n -> n == null ? ".." : String.valueOf(n))
                .collect(Collectors.joining(" "));

        return new String[]{question, String.valueOf(missingNumber)};
    }

    private static List<Integer> generateProgression() {
        int start = RANDOM.nextInt(MAX_RANDOM_NUMBER_EXCLUSIVE); // начальное число
        int step = RANDOM.nextInt(5) + 1; // шаг от 1 до 5
        int length = 10;
        List<Integer> progression = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            progression.add(start + i * step);
        }
        return progression;
    }

    public static String getRules() {
        return RULE;
    }
}
