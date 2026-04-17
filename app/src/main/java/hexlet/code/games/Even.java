package hexlet.code.games;

import hexlet.code.Round;

public final class Even extends Game {
    public Even() {
        codeGame = 2;
    }

    @Override
    public String getRules() {
        return MESSAGES.getString("even.rule");
    }

    @Override
    public Round generateRound() {
        int number = random.nextInt(100);
        return new Round(Integer.toString(number), isEven(number));
    }

    private String isEven(int number) {
        boolean even = number % 2 == 0;
        return even ? "yes" : "no";
    }


}
