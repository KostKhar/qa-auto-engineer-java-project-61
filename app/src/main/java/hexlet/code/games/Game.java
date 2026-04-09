package hexlet.code.games;


import java.util.Random;
import java.util.ResourceBundle;

public abstract class Game {
    protected static final ResourceBundle MESSAGES =
            ResourceBundle.getBundle("messages");
    protected final Random random = new Random();
    int codeGame;

    protected Game() {
    }

    public abstract String getRules();

    public abstract Round generateRound();

    public int getCode() {
        return codeGame;
    }

}
