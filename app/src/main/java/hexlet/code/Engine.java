package hexlet.code;

import java.util.Scanner;

public class Engine {

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
