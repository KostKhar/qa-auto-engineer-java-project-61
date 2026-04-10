package hexlet.code.games;

import java.util.Random;

public class Calc extends Game {
    public Calc() {
        codeGame = 3;
    }

    public static char getRandomMathSymbol() {
        char[] symbols = {'+', '-', '*'};
        return symbols[random.nextInt(symbols.length)];
    }

    @Override
    public String getRules() {
        return MESSAGES.getString("calc.rule");
    }

    @Override
    public Round generateRound() {
        int number = random.nextInt(10);
        int number1 = random.nextInt(10);
        char mathSymbol = getRandomMathSymbol();
        return new Round(number + " " + mathSymbol + " " + number1, getSummary(number, number1, mathSymbol).toString());
    }

    public Integer getSummary(int n, int n1, char mathSymbol) {
        return switch (mathSymbol) {
            case '+' -> n + n1;
            case '-' -> n - n1;
            case '*' -> n * n1;
            default -> throw new IllegalArgumentException("Invalid math symbol");
        };
    }


}
