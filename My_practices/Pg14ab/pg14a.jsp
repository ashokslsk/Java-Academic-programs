<html>
<body bgcolor=orange>
<%! int i,j,n; %>
<%
out.println("<br><h2>Even Numbers : <br>");
i=0;n=1;
while(n<=10)
{
out.println(i+" ");
i+=2;
n++;
}
out.println("<br><br><h2>Odd Numbers :<br>") ;
j=1;
n=1;
while(n<=10)
{
out.println(j+" ");
j+=2;
n++;
}
%>
</body>
</html>