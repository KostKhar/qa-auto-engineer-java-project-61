package hexlet.code;

import java.util.ResourceBundle;
import java.util.Scanner;

public final class Cli {
    private static final ResourceBundle MESSAGES =
            ResourceBundle.getBundle("messages");

    private Cli() {
    }

    public static String helloPlayerInGame(Scanner sc) {
        System.out.println(MESSAGES.getString("hello"));
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
