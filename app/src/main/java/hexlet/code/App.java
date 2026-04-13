package hexlet.code;

public class App {
    public static void main(String[] args) {
        String ganerName = Cli.helloPlayerInGame();
        Engine engine = new Engine();

        engine.run(ganerName);
    }
}
