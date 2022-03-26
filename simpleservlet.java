import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Simpleservlet extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse res)
    throws ServletExceptio, IO, Exception {
    res.setContentType("test/html");
    PrintWrite pw = res.getWriter();
    pw.println("<html><body>");
    pw.println("<h1>Welcome to web 3.0 </h1>");
    pw.println("</body></html>");
    pw.close();
  }
}
