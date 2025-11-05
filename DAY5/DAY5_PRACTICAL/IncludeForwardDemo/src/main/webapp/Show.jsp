<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="Img1.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SHOW DATA</title>
</head>
<body>
<%
String uname=request.getParameter("uname");
String pass=request.getParameter("pass");
%>
<h2>WELCOME:<%=uname %></h2>
<h2>YOUR PASSWORD:<%=pass %></h2>

</body>
</html>