import java.util.ArrayList;
import java.util.List;

public class QuestionFactory {

    private static final List<Question> questions = new ArrayList<>();

    public static List<Question> getQuestions() {

        if (questions.isEmpty()) {

            Question question1 = new Question(1, "Сколько модификаторов доступа существует в Java?");
            questions.add(question1);

            Question question2 = new Question(2, "Какое значение по умолчанию имеет переменная типа boolean?");
            questions.add(question2);

            Question question3 = new Question(3, "Сколько логических операторов в Java?");
            questions.add(question3);

        }

        return questions;
    }

}