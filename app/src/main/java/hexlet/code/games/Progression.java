package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public  class Progression extends Game{
    public Progression() {
        codeGame=5;
    }

    @Override
    public String getRules() {
        return MESSAGES.getString("progression.rule");
    }


    @Override
    public Round generateRound() {
        List<Integer> progression = generateProgression();
        int missingIndex = random.nextInt(progression.size());
        int missingNumber = progression.get(missingIndex);
        progression.set(missingIndex, null);

        String question = progression.stream()
                .map(n -> n == null ? ".." : String.valueOf(n))
                .collect(Collectors.joining(" "));

        return new Round(question, String.valueOf(missingNumber));
    }

    private List<Integer> generateProgression() {
        int start = random.nextInt(100); // начальное число
        int step = random.nextInt(5) + 1; // шаг от 1 до 5
        int length = 10;
        List<Integer> progression = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            progression.add(start + i * step);
        }
        return progression;
    }
}
