package hexlet.code;

import java.util.Scanner;


public final class CliUtility {
    private CliUtility() {
    }

    public static String helloPlayerInGame(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.nextLine().trim();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
