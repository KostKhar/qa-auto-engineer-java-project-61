package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void helloPlayerInGame(){
        System.out.println("Welcome to the Brain Games! \n" +
                "May I have your name?");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
