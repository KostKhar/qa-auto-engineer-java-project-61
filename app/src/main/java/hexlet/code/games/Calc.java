package hexlet.code.games;

import java.util.Random;

public class Calc {

    private Calc game;
    private Random random = new Random();
    private int number;
    private int number1;
    private char mathSymbol;
    private static final String RULE= "What is the result of the expression?";


    public Calc() {
    }

    public String getGame() {
        if (game == null) {
            game = new Calc();
        }
        return RULE +"\nQuestion:" +  getRandomMathQuestion() + "\nYour answer:";
    }

    public  String getAnswer(){
        return String.valueOf(getSummary(number, number1, mathSymbol));
    }



    public char getRandomMathSymbol() {
        char[] symbols = {'+', '-', '*'};
        return symbols[random.nextInt(symbols.length)];
    }


    public String getRandomMathQuestion() {
        this.number = random.nextInt(10);
        this.number1 = random.nextInt(10);
        this.mathSymbol = getRandomMathSymbol();
        return number + " " + mathSymbol + " " + number1;
    }

    public int getSummary(int n, int n1, char mathSymbol) {
        return switch (mathSymbol) {
            case '+' -> n + n1;
            case '-' -> n - n1;
            case '*' -> n * n1;
            default -> throw new IllegalArgumentException("Invalid math symbol");
        };
    }

}
