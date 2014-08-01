<html>
<body bgcolor="pink">
<jsp:useBean id="stud" scope="request" class="beans.Student"/>
<h2>Entered Student Information</h2>
<br><br>
<h3>
Student Name : <jsp:getProperty name="stud" property="sname"/><br>
USN : <jsp:getProperty name="stud" property="usn"/><br>
Total Marks : <%out.print(stud.getsmarks());%>
</h3>
</body>
</html>