<%! String username=null,password=null; %>
<%
username=request.getParameter("uname");
password=request.getParameter("pwd");
%>
<%
if(username.equals("test") && password.equals("test123"))
response.sendRedirect("http://localhost:8080/pg14b/pg14wel.jsp");
else
out.println("<center><h2>Invalid username or password");
%>