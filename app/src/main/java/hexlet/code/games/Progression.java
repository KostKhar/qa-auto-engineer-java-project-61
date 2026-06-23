package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public final class Progression {
    private static final String RULE = "What number is missing in the progression?";
    private static final int MAX_RANDOM_NUMBER_EXCLUSIVE = 100;
    private static final int MAX_STEP = 5;
    private static final int MIN_STEP = 1;
    private static final int LENGTH_OF_ARRAY = 10;

    private Progression() {
    }

    public static void play(Scanner scanner) {
        Engine.run(RULE, Progression::generateRound, scanner);
    }

    private static String[] generateRound() {
        List<Integer> progression = generateProgression();
        int missingIndex = RandomUtils.getRandomInt(progression.size());
        int missingNumber = progression.get(missingIndex);
        progression.set(missingIndex, null);

        String question = progression.stream()
                .map(n -> n == null ? ".." : String.valueOf(n))
                .collect(Collectors.joining(" "));

        return new String[]{question, String.valueOf(missingNumber)};
    }

    private static List<Integer> generateProgression() {
        int start = RandomUtils.getRandomInt(MAX_RANDOM_NUMBER_EXCLUSIVE);
        int step = RandomUtils.getRandomInt(MIN_STEP, MAX_STEP + 1);
        int length = LENGTH_OF_ARRAY;
        List<Integer> progression = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            progression.add(start + i * step);
        }
        return progression;
    }

}
