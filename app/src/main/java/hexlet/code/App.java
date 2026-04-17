package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Even;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.Game;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;

public class App {
    private static final ResourceBundle MESSAGES =
            ResourceBundle.getBundle("messages");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Game> games = new ArrayList<>();
        games.add(new Even());
        games.add(new Calc());
        games.add(new GCD());
        games.add(new Progression());
        games.add(new Prime());

        Map<Integer, Game> gamesByCode = new HashMap<>();
        for (Game game : games) {
            int code = game.getCode();
            if (gamesByCode.containsKey(code)) {
                throw new IllegalStateException("Duplicate game code: " + code);
            }
            gamesByCode.put(code, game);
        }

        System.out.println(MESSAGES.getString("menu.title"));
        System.out.println("1 - " + MESSAGES.getString("menu.greet"));
        for (Game game : games) {
            System.out.println(game.getCode() + " - " + game.getClass().getSimpleName());
        }
        System.out.println(MESSAGES.getString("menu.exit"));

        String commandRaw = scanner.nextLine().trim();
        int commandNumber;
        try {
            commandNumber = Integer.parseInt(commandRaw);
        } catch (NumberFormatException e) {
            System.out.println(MESSAGES.getString("menu.invalid"));
            return;
        }

        if (commandNumber == 1) {
            Cli.helloPlayerInGame(scanner);
            return;
        }
        if (commandNumber == 0) {
            return;
        }

        Game chosen = gamesByCode.get(commandNumber);
        if (chosen == null) {
            System.out.println(MESSAGES.getString("menu.invalid"));
            return;
        }
        Engine.run(chosen, scanner);
    }

}
