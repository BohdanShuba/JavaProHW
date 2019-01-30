import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/test")
public class HelloWorldServlet extends HttpServlet {
    public void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("txt/hnml; charset=utf-8");

        resp.getWriter().println("<H1>Hi world</H1>");
    }
}
