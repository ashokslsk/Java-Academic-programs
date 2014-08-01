import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class serv12b extends HttpServlet
{
public void doGet (HttpServletRequest request,HttpServletResponse response)throws
IOException,ServletException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
out.println("<center><h2>Request send to the second page");
}
}