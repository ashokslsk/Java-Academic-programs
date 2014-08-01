import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class serv13 extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws
IOException,ServletException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
HttpSession session=request.getSession(true);
String id=session.getId();
out.println("<html>");
out.println("<body>");
out.println("session id="+id);
out.println("<br>");
out.println("session="+session);
out.println("<br>");
Integer ival=(Integer)session.getAttribute("sessiontest.counter");
if(ival==null)
ival=new Integer(1);
else
ival=new Integer(ival.intValue()+1);
session.setAttribute("sessiontest.counter",ival);
out.println("you have visited the page "+ival+" times");
out.println("</body>");
out.println("</html>");
}
}