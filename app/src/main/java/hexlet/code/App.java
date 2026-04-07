package hexlet.code;

import hexlet.code.game.EvenNumber;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");

        if (!scanner.hasNextInt()) {
            System.out.println("Please choose a number between 0 and 1. Please retry the program.");
            return;
        }

        int commandNumber = scanner.nextInt();
        System.out.println("Your choice: " + commandNumber);

        switch (commandNumber) {
            case 0:
                return;

            case 1:
                String gamerName = Cli.helloPlayerInGame();
                EvenNumber evenNumber = new EvenNumber();
                System.out.println(evenNumber.getAnswer(gamerName));
                break;

            default:
                System.out.println("Please choose a number between 0 and 1. Please retry the program.");
        }
    }
}
