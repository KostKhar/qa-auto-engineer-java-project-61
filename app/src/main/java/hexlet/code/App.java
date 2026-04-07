package hexlet.code;

import hexlet.code.game.EvenNumber;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int commandNumber = scanner.nextInt();
            System.out.println("Your choice: " + commandNumber);
            if (commandNumber == 0) {
                return;
            }

            String gamerName = Cli.helloPlayerInGame();
            if (commandNumber == 1) {
                EvenNumber evenNumber = new EvenNumber();
                System.out.println(evenNumber.getAnswer(gamerName));
            }
        } else {
            System.out.println("Please choose a number between 0 and 1."
                    + " Retry the program please.");
        }
    }
}
