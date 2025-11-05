<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page language="java" errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CALCULATION</title>
</head>
<body>
<%
int i1=Integer.parseInt(request.getParameter("input1"));
int i2=Integer.parseInt(request.getParameter("input2"));
%>
<h2>RESULT:<%=i1/i2 %></h2>
</body>
</html>