import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class QuestionServlet extends HttpServlet {
    static final int QUESTION_1_YES = 0;
    static final int QUESTION_1_NO = 1;
    static final int QUESTION_2_YES = 0;
    static final int QUESTION_2_NO = 1;

    static final String TEMPLATE = "<html>"
            + "<head><title>Prog.kiev.ua</title></head>"
            + "<body><h1>%s</h1></body></html>";

    final int [] results = new int[4];

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        final String q1 = req.getParameter("question1");
        final String q2 = req.getParameter("question2");

        final int indx1 = "yes".equals(q1) ? QUESTION_1_YES:QUESTION_1_NO;
        final int indx2 = "yes".equals(q2) ? QUESTION_2_YES:QUESTION_2_NO;

        results[indx1]++;
        results[indx2]++;

        String res = "<p>Question 1: yes = " + results[QUESTION_1_YES]+", no = " +results[QUESTION_1_NO] +"/p";
        res += "<p>Question 2: yes = " + results[QUESTION_2_YES]+", no = " +results[QUESTION_2_NO] +"/p";

        resp.getWriter().println(String.format(TEMPLATE, res));
    }
}

