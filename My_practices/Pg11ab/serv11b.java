import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class serv11b extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet
{
public void doPost(HttpServletRequest request,HttpServletResponse response)throws
IOException,ServletException
{
PrintWriter out=response.getWriter();
out.println("<html>");
out.println("<body bgcolor='skyblue'>");
out.println("<center><h2>Hi.... this is Registering servlet</center></h2>");
out.println("</body>");
out.println("</html>");
}
}