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
String rollno=request.getParameter("rollno");
String sname=request.getParameter("sname");
String ayr=request.getParameter("ayr");
String sem=request.getParameter("sem");
String yr=request.getParameter("yr");
String dept=request.getParameter("dept");
String phno=request.getParameter("phno");
String email=request.getParameter("email");
String city=request.getParameter("city");
%>
<h2>ROLLNO:<%=rollno %></h2>
<h2>NAME:<%=sname %></h2>
<h2>ADMISSION YEAR:<%=ayr %></h2>
<h2>SEMESTER:<%=sem %></h2>
<h2>YEAR:<%=yr %></h2>
<h2>DEPARTMENT:<%=dept %></h2>
<h2>PHONE NUMBER:<%=phno %></h2>
<h2>EMAIL:<%=email %></h2>
<h2>CITY:<%=city %></h2>
</body>
</html>