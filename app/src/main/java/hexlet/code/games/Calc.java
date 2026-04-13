package hexlet.code.games;

public class Calc {

    private Calc game;
    private static final String QUESTION= "What is the result of the expression?;"


    private Calc() {
    }

    public Calc getGame() {
        if (game == null) {
            game = new Calc();
        }
        return game;
    }

    public String getQuestion() {
        return QUESTION;
    }

    public String getRandomMathQuestion(){

    }

    public String getAnswer() {

    }

}
