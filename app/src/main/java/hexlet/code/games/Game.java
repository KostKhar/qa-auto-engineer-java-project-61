package hexlet.code.games;


import hexlet.code.Round;

import java.util.Random;
import java.util.ResourceBundle;

public abstract class Game {
    protected static final ResourceBundle MESSAGES =
            ResourceBundle.getBundle("messages");
    protected Random random = new Random();
    int codeGame;

    public abstract String getRules();

    public abstract Round generateRound();

    public int getCode() {
        return codeGame;
    }

}
