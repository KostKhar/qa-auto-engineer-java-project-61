package hexlet.code.games;

import hexlet.code.Round;

public final class GCD extends Game {

    public GCD() {
        codeGame = 4;
    }

    @Override
    public String getRules() {
        return MESSAGES.getString("gsd.rule");
    }

    @Override
    public Round generateRound() {
        int number = random.nextInt(1, 10);
        int number1 = number * random.nextInt(1, 7);
        int number2 = number * random.nextInt(1, 8);
        return new Round(number1 + " " + number2, gcd(number1, number2).toString());
    }

    private Integer gcd(int a, int b) {
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
