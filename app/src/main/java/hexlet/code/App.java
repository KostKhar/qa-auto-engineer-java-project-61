package hexlet.code;



import java.util.Scanner;

public class App {

    private static final int COMMAND_EXIT = 0;
    private static final int COMMAND_GREET = 1;
    private static final int COMMAND_EVEN = 2;
    private static final int COMMAND_CALC = 3;
    private static final int COMMAND_GCD = 4;
    private static final int COMMAND_PRIME = 5;
    private static final int COMMAND_PROGRESSION = 6;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String gamerName = CliUtility.helloPlayerInGame(scanner);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println(COMMAND_EXIT + " - Exit");
        System.out.println(COMMAND_GREET + " - Greet");
        System.out.println(COMMAND_EVEN + " - Even");
        System.out.println(COMMAND_CALC + " - Calc");
        System.out.println(COMMAND_GCD + " - GCD");
        System.out.println(COMMAND_PRIME + " - Prime");
        System.out.println(COMMAND_PROGRESSION + " - Progression");

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
            System.out.println("Bye, " + gamerName + "!");
            return;
        }

        switch (commandNumber) {
            case COMMAND_GREET -> System.out.println("Hello, " + gamerName + "!");
            case COMMAND_EVEN -> Engine.run(Engine.GameId.EVEN, gamerName, scanner);
            case COMMAND_CALC -> Engine.run(Engine.GameId.CALC, gamerName, scanner);
            case COMMAND_GCD -> Engine.run(Engine.GameId.CALC, gamerName, scanner);
            case COMMAND_PRIME -> Engine.run(Engine.GameId.CALC, gamerName, scanner);
            case COMMAND_PROGRESSION -> Engine.run(Engine.GameId.CALC, gamerName, scanner);
            default -> System.out.println("Unknown command. Please choose "
                    + COMMAND_EXIT + ", "
                    + COMMAND_GREET + ", "
                    + COMMAND_EVEN + ", "
                    + COMMAND_CALC + ", "
                    + COMMAND_GCD + ", "
                    + COMMAND_PRIME + " or "
                    + COMMAND_PROGRESSION +
                    ".");
        }
    }
}
