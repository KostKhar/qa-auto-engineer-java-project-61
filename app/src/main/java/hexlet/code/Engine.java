package hexlet.code;

import java.util.Scanner;
import java.util.function.Supplier;

public class Engine {
    public static final int ROUNDS_COUNT = 3;

    public static void run(String rules, Supplier<String[]> roundGenerator, Scanner scanner) {
        String[][] rounds = new String[ROUNDS_COUNT][2];
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            rounds[i] = roundGenerator.get();
        }
        run(rules, rounds, scanner);
    }

    public static void run(String rules, String[][] rounds, Scanner scanner) {
        String gamerName = Cli.greet();

        System.out.println(rules);

        for (String[] round : rounds) {
            String question = round[0];
            String correctAnswer = round[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(.");
                System.out.println("Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + gamerName + "!");
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + gamerName + "!");
    }
}
