package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class Engine {

    private static final int COUNT_OF_ROUND_GAMES = 3;
    private Calc mCalc;
    private Even mEven;
    private Scanner scanner= new Scanner(System.in);

    public  void run(String gamerName) {
        int gameId = Integer.parseInt(scanner.nextLine());
        for(int  i = 0; i < COUNT_OF_ROUND_GAMES; i++) {
            ruleByGame(gameId);
            getAnswerGame(gameId);
        }
        System.out.printf("Congratulations, %s!", gamerName);
    }

    public String ruleByGame(int gameId){
        switch (gameId) {
            case 1:
                return mEven.getRule();
            case 2:
                return mCalc.getGame();
            default:
                throw new IllegalArgumentException("Invalid game id");
        }
    }


    public String getAnswerGame(int gameId){
            switch (gameId) {
                case 1:
                    return String.valueOf(mEven.getRandomNumber());
                case 2:
                    return mCalc.getAnswer();
                default:
                    throw new IllegalArgumentException("Invalid game id");
            }
        }

}
