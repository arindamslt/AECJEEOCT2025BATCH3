<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DISPLAY DATA</title>
</head>
<body>
<%
String cid=request.getParameter("cid");
String cname=request.getParameter("cname");
String cphno=request.getParameter("cphno");
%>
<h2>CID:<%=cid %></h2>
<h2>NAME:<%=cname %></h2>
<h2>PHONE NUMBER:<%=cphno %></h2>
</body>
</html>