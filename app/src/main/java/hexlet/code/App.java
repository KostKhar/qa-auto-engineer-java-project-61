package hexlet.code;

import hexlet.code.games.Even;

import java.util.ResourceBundle;
import java.util.Scanner;

public class App {
    private static final ResourceBundle MESSAGES =
            ResourceBundle.getBundle("messages");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        switch (commandNumber) {
            case 0:
                System.out.println(MESSAGES.getString("menu.exit_message"));
                return;

            case 1:
                break;

            case 2:
                String gamerName = Cli.helloPlayerInGame();
                Even evenNumber = new Even();
                System.out.println(evenNumber.playGame(gamerName));
                break;

            default:
                System.out.println(MESSAGES.getString("menu.invalid"));
        }
    }
}
