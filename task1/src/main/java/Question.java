import java.util.List;

public class Question {
    private final String text;
    private final List<Answer> answers;

    @Override
    public String toString() {
        return "Question{" +
                "text='" + text + '\'' +
                ", answers=" + answers +
                '}';
    }

    public String getText() {
        return text;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public Question(String text, List<Answer> answers) {
        this.text = text;
        this.answers = answers;

    }
}
