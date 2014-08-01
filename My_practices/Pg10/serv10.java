import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class serv10 extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response)throws
ServletException,IOException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
String fname = request.getParameter("f1");
System.out.println(fname);
File f = new File(fname);
if(f.exists())
{
out.println(f.getName());
out.println("<hr size='2' style='color:green'>");
out.println("Contents of the File is:<br>");
out.println("<hr size='2' style='color:green'/><br>");
BufferedReader in = new BufferedReader(new FileReader(f));
String buf=" ";
while((buf = in.readLine())!= null)
{
out.write(buf);
out.flush();
out.println("<br>");
}
in.close();
out.println("<hr size='3' style='color:red'></font></p></body>\n</html>");
}
else
{
out.println("Filename : " + fname);
out.println("<h1>File Doesn't Exists</h1>\n");
}
}
}