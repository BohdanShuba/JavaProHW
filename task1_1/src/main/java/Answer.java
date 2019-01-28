public class Answer {
    private final String name;
    private final String surname;
    private final String answer;

    public Answer(String name, String surname, String answer) {
        this.name = name;
        this.surname = surname;
        this.answer = answer;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}