package hexlet.code.games;

import hexlet.code.Round;

public class Prime extends Game {

    public Prime() {
        codeGame = 6;
    }

    public static String isPrime(int n) {
        if (n <= 1) {
            return "no";
        }
        if (n <= 3) {
            return "yes";
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return "no";
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return "no";
            }
        }
        return "yes";
    }

    @Override
    public String getRules() {
        return MESSAGES.getString("prime.rule");
    }

    @Override
    public Round generateRound() {
        int number = random.nextInt(100);
        return new Round(Integer.toString(number), isPrime(number));
    }
}
