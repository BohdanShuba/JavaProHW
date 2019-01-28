import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "QuestionServlet", urlPatterns = "/question")
public class QuestionServlet extends HttpServlet {
    static final int QUESTION_1_YES = 0;
    static final int QUESTION_1_NO = 1;
    static final int QUESTION_2_YES = 2;
    static final int QUESTION_2_NO = 3;
    static final int QUESTION_3_YES = 4;
    static final int QUESTION_3_NO = 5;
    static final int QUESTION_4_YES = 6;
    static final int QUESTION_4_NO = 7;
    final int[] results = new int[8];
    List<Person> pesons = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        final String q1 = request.getParameter("question1");
        final String q2 = request.getParameter("question2");
        final String q3 = request.getParameter("question3");
        final String q4 = request.getParameter("question4");

        final int idx1 = "yes".equals(q1) ? QUESTION_1_YES : QUESTION_1_NO;
        final int idx2 = "yes".equals(q2) ? QUESTION_2_YES : QUESTION_2_NO;
        final int idx3 = "yes".equals(q3) ? QUESTION_3_YES : QUESTION_3_NO;
        final int idx4 = "yes".equals(q4) ? QUESTION_4_YES : QUESTION_4_NO;

        results[idx1]++;
        results[idx2]++;
        results[idx3]++;
        results[idx4]++;
        Person person = new Person();
        person.setLastName(request.getParameter("lastName"));
        person.setName(request.getParameter("firstName"));
        person.setAge(request.getParameter("age"));
        pesons.add(person);

        request.setAttribute("pers", pesons);
        request.setAttribute("rez", results);
        request.setAttribute("total", pesons.size());
        request.getRequestDispatcher("/statistic.jsp").forward(request, response);
    }
}