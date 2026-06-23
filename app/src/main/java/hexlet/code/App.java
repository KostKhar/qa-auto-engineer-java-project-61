package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    private static final int COMMAND_EXIT = 0;
    private static final int COMMAND_GREET = 1;
    private static final int COMMAND_EVEN = 2;
    private static final int COMMAND_CALC = 3;
    private static final int COMMAND_GCD = 4;
    private static final int COMMAND_PROGRESSION = 5;
    private static final int COMMAND_PRIME = 6;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter the game number and press Enter.");
        System.out.println(COMMAND_EXIT + " - Exit");
        System.out.println(COMMAND_GREET + " - Greet");
        System.out.println(COMMAND_EVEN + " - Even");
        System.out.println(COMMAND_CALC + " - Calc");
        System.out.println(COMMAND_GCD + " - GCD");
        System.out.println(COMMAND_PROGRESSION + " - Progression");
        System.out.println(COMMAND_PRIME + " - Prime");

        String choiceLine = scanner.nextLine().trim();
        int commandNumber;
        try {
            commandNumber = Integer.parseInt(choiceLine);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please choose a number between "
                    + COMMAND_EXIT + " and " + COMMAND_PROGRESSION + ".");
            return;
        }
        System.out.println("Your choice: " + commandNumber);

        if (commandNumber == COMMAND_EXIT) {
            return;
        }

        switch (commandNumber) {
            case COMMAND_GREET -> Cli.greet();
            case COMMAND_EVEN -> Even.play(scanner);
            case COMMAND_CALC -> Calc.play(scanner);
            case COMMAND_GCD -> GCD.play(scanner);
            case COMMAND_PROGRESSION -> Progression.play(scanner);
            case COMMAND_PRIME -> Prime.play(scanner);
            default -> System.out.println("Unknown command. Please choose "
                    + COMMAND_EXIT + ", "
                    + COMMAND_GREET + ", "
                    + COMMAND_EVEN + ", "
                    + COMMAND_CALC + ", "
                    + COMMAND_GCD + ", "
                    + COMMAND_PRIME + " or "
                    + COMMAND_PROGRESSION
                    + ".");
        }
    }
}
