package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Game;

import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

public class App {
    private static final ResourceBundle MESSAGES =
            ResourceBundle.getBundle("messages");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Game> games = new LinkedList<>();
        games.add(new Even());
        games.add(new Calc());


        System.out.println(MESSAGES.getString("menu.title"));
        System.out.println(MESSAGES.getString("menu.greet"));
        System.out.println(MESSAGES.getString("menu.even"));
        System.out.println(MESSAGES.getString("menu.calc"));
        System.out.println(MESSAGES.getString("menu.exit"));

        if (!scanner.hasNextInt()) {
            System.out.println(MESSAGES.getString("menu.invalid"));
            return;
        }

        int commandNumber = scanner.nextInt();
        System.out.println("Your choice: " + commandNumber);

        for (Game game : games) {
            if (game.getCode() == commandNumber) {
                Engine.run(game);
            }
        }
    }
}
