import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class serv9 extends HttpServlet
{
public void doPost(HttpServletRequest request,HttpServletResponse response)throws
IOException,ServletException
{
response.setContentType("text/html");
PrintWriter out = response.getWriter();
String str = request.getParameter("uname");
String str1 = request.getParameter("pname");
out.println("<html>");
out.println("<body>");
out.println("User Name is "+str+"<br>");
out.println("Password is "+str1);
out.println("</body>");
out.println("</html>");
}
}