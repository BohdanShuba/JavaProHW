public class Answer {
    private final String answer;

    public Answer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answer='" + answer + '\'' +
                '}';
    }

    public String getAnswer() {
        return answer;
    }
}

