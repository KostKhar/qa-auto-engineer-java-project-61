package hexlet.code.games;

import java.util.Random;

public class Calc {

    private Calc game;
    private Random random = new Random();
    private static final String RULE= "What is the result of the expression?";


    private Calc() {
    }

    public Calc getGame() {
        if (game == null) {
            game = new Calc();
        }
        return game;
    }

    public static String getRule() {
        return RULE;
    }


    public char getRandomMathSymbol() {
        char[] symbols = {'+', '-', '*'};
        return symbols[random.nextInt(symbols.length)];
    }


    public String getRandomMathQuestion() {
        int number = random.nextInt(10);
        int number1 = random.nextInt(10);
        char mathSymbol = getRandomMathSymbol();
        return number + " " + mathSymbol + " " + number1;
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
