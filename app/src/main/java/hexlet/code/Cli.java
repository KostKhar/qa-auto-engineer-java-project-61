package hexlet.code;

import java.util.ResourceBundle;
import java.util.Scanner;

public class Cli {
    private static final ResourceBundle MESSAGES =
            ResourceBundle.getBundle("messages");

    private Cli() {
    }

    public static String helloPlayerInGame() {
        System.out.println(MESSAGES.getString("hello.your_name"));
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
