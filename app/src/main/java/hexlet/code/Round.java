package hexlet.code;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Round {
    private String question;
    private String correctAnswer;

    public Round(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }
}
