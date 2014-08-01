<html>
<body>
<jsp:useBean id="stud" scope="request" class="beans.Student"/>
<jsp:setProperty name="stud" property="*"/>
<jsp:forward page="display.jsp"/>
</body>
</html>