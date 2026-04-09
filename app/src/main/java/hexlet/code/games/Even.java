package hexlet.code.games;

public class Even extends Game {
    private Integer number;


    public Even() {
        super();
        codeGame = 2;
        this.number = random.nextInt(1000);
    }

    @Override
    public String getRules() {
        return MESSAGES.getString("even.rule");
    }

    @Override
    public Round generateRound() {
        number = random.nextInt();
        return new Round(number.toString(), isEven(number));
    }

    private String isEven(int number) {
        boolean even = number % 2 == 0;
        return even ? "yes" : "no";
    }


}
