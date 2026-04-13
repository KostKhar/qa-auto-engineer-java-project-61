package hexlet.code.games;

import java.util.Random;

public class Even {
    private static Even game;
    private Random random = new Random();
    private static final String QUESTION= "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private Even() {
    }

    public static Even getGame(){
        if (game == null) {
            game = new Even();
        }
        return game;
    }

    public static String getQuestion(){
        return QUESTION;
    }

    public int getRandomNumber(){
        return random.nextInt(100);
    }

    public static boolean isEven(int number){
        return  number % 2 == 0;
    }

}
