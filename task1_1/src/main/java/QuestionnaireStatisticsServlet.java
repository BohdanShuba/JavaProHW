import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/answer")
public class QuestionnaireStatisticsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        if (name != null || surname != null) {
            for (Question question : QuestionFactory.getQuestions()) {
                String answer = request.getParameter("question[" + question.getId() + "]");
                question.addAnswer(new Answer(name, surname, answer));
            }
        }
        request.setAttribute("questionList", QuestionFactory.getQuestions());
        request.getRequestDispatcher("answers.jsp").forward(request, response);
    }


}