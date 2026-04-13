package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

public class Engine {

    private static final int COUNT_OF_ROUND_GAMES = 3;

    public  void run(String gamerName, int gameId, String question, String answer) {
        for(int  i = 0; i < COUNT_OF_ROUND_GAMES; i++) {
            ruleByGame(gameId);
            getQuestionGame(gameId);
            getAnswerGame(gameId);
        }
        System.out.printf("Congratulations, %s!", gamerName);
    }

    public String ruleByGame(int gameId){
        switch (gameId) {
            case 1:
                return Even.getRule();
            case 2:
                return Calc.getRule();
            default:
                throw new IllegalArgumentException("Invalid game id");
        }
    }

    public  String getQuestionGame(int gameId) {
        switch (gameId) {
            case 1:
                return String.valueOf(Even.getRandomNumber());
            case 2:
                return Calc.getRule();
            default:
                throw new IllegalArgumentException("Invalid game id");
        }
    }

    public String getAnswerGame(int gameId){
            switch (gameId) {
                case 1:
                    return String.valueOf(Even.getRandomNumber());
                case 2:
                    return Calc.getRule();
                default:
                    throw new IllegalArgumentException("Invalid game id");
            }
        }

}
