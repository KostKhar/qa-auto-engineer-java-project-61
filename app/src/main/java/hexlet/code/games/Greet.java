package hexlet.code.games;

import java.util.Scanner;

public final class Greet {

    private Greet() {
    }

    public static String helloPlayerInGame(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine().trim();
        System.out.println("Hello, " + name + "!");
        return name;
    }

}
