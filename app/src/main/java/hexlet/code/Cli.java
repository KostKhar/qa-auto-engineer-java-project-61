package hexlet.code;

import java.util.Scanner;

public class Cli {
    private Cli() {
    }

    public static String helloPlayerInGame() {
        System.out.println("Welcome to the Brain Games! \nMay I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
