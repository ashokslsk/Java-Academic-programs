import java.io.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class serv11a extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet
{
public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException,
ServletException
{
String decider=request.getParameter("decider");
RequestDispatcher rd=null;
if("forward".equals(decider))
{
rd=request.getRequestDispatcher("serv11b");
rd.forward(request,response);
}
else if("include".equals(decider))
{
rd=request.getRequestDispatcher("serv11b");
rd.include(request,response);
}
PrintWriter out=response.getWriter();
out.println("<br><center>Hi.... i am a Program to demonstrate
requestdispatcher</center>");
}
}