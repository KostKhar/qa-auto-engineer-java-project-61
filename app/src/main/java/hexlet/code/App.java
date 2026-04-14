package hexlet.code;

import java.util.Scanner;
import java.util.logging.Logger;

public class App {

    static Logger logger = Logger.getLogger(App.class.getName());
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String ganerName = Cli.helloPlayerInGame();

        logger.info("Please enter the game number and press Enter.");
        logger.info(MESSAGES.getString("menu.exit"));

        if (!scanner.hasNextInt()) {
            logger.info(MESSAGES.getString("menu.invalid"));
            return;
        }

        int commandNumber = scanner.nextInt();
        logger.info("Your choice: " +commandNumber);

        Engine engine = new Engine();

        engine.run(ganerName);
    }
}
