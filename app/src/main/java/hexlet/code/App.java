package hexlet.code;

import hexlet.code.games.*;

import java.util.*;

public class App {
    private static final ResourceBundle MESSAGES =
            ResourceBundle.getBundle("messages");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Game> games = new ArrayList<>();
        games.add(new Greet());
        games.add(new Even());
        games.add(new Calc());
        games.add(new GCD());
        games.add(new Progression());


        System.out.println(MESSAGES.getString("menu.title"));
        for (Game game : games) {
            System.out.println(game.getCode() + " - " + game.getClass().getSimpleName());
        }
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
                return;
            }
        }
        System.out.println(MESSAGES.getString("menu.invalid"));
    }

}
