package hexlet.code.games;


import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;

public abstract class Game {
    protected static final ResourceBundle MESSAGES =
            ResourceBundle.getBundle("messages");
    protected final Random random = new Random();

    public abstract String getRules();
    public abstract Round generateRound();

    int codeGame;

    protected Game() {
    }

    protected int getCode() {
        return codeGame;
    }



}
