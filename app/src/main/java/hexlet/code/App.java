package hexlet.code;

import hexlet.code.game.EvenNumber;

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
                EvenNumber evenNumber = new EvenNumber();
                System.out.println(evenNumber.getAnswer(gamerName));
                break;

            default:
                System.out.println(MESSAGES.getString("menu.invalid"));
        }
    }
}
