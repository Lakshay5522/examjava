import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 * Practical 8 - Login servlet: form and handler in ONE file.
 *
 * Combines the former index.html (login form) and LoginServlet.java.
 * The form is shown when no credentials are supplied; otherwise the
 * servlet checks them (admin / 12345).
 */
public class Servlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String uname = request.getParameter("t1");
        String upass = request.getParameter("t2");

        out.println("<html><head><title>Servlet LoginServlet</title></head>");

        if (uname == null || upass == null) {
            // No credentials yet - show the login form.
            out.println("<body>");
            out.println("<h2>Login Form</h2>");
            out.println("<form action='Servlet'>");
            out.println("Enter User ID<input type='text' name='t1'><br>");
            out.println("Enter Password<input type='password' name='t2'><br>");
            out.println("<input type='reset'>");
            out.println("<input type='submit' value=' Click to Login '>");
            out.println("</form>");
        } else if (uname.equals("admin") && upass.equals("12345")) {
            out.println("<body bgcolor=blue >");
            out.println("<h1> Welcome !!! " + uname + "</h1>");
        } else {
            out.println("<body bgcolor=red >");
            out.println("<h1> Login Fail !!! </h1>");
        }

        out.println("</body></html>");
    }
}
