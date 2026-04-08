package hexlet.code.games;

import java.util.Random;

public class Calc extends Game{
    public Calc() {
        super();
        codeGame = 3;
    }

    public String playGame(String gamerName) {
        for (int i = 0; i < 3; i++) {
            int number = random.nextInt();
            int number1 = random.nextInt();
            char mathSymbol = getRandomMathSymbol();

            System.out.println(MESSAGES.getString("game.rule"));
            System.out.println(MESSAGES.getString("game.question") + number + " "+ mathSymbol + " " + number1);

            int sum = getSummary(number, number1, mathSymbol);

            int answer = scanner.nextInt();
            System.out.println(MESSAGES.getString("game.your_answer") + answer);

            if(answer == sum){
                MESSAGES.getString("game.correct");
            } else {
                return MESSAGES.getString("game.invalid");
            }
        }
        return MESSAGES.getString("game.congratulations") + gamerName;
    }

    public static char getRandomMathSymbol() {
        char[] symbols = {'+', '-', '*'};
        return symbols[new Random().nextInt(symbols.length)];
    }

    public Integer getSummary(int n, int n1, char mathSymbol) {
        return switch (mathSymbol) {
            case '+' -> n + n1;
            case '-' -> n - n1;
            case '*' -> n * n1;
            default -> throw  new IllegalArgumentException("Invalid math symbol");
        };
    }


}
