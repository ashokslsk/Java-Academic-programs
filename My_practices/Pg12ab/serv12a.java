import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class serv12a extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws
IOException,ServletException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
String type=request.getParameter("typevalue");
if(type.equals("first"))
out.println("<center><h2>Request send to the firstpage");
else
response.sendRedirect("http://localhost:8080/pg12/servlet/serv12b");
}
}
