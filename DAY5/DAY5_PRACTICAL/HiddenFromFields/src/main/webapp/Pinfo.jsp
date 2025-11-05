<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PERSONNEL INFORMATION</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<%
String rollno=request.getParameter("rollno");
String sname=request.getParameter("sname");
String ayr=request.getParameter("ayr");
String sem=request.getParameter("sem");
String yr=request.getParameter("yr");
String dept=request.getParameter("dept");
%>
<div style="width:30%;margin:50px auto;">
	<form action="Show.jsp" method="post">
		<h2 class="text-info">PERSONNEL INFORMATION FORM</h2>
		<input type="text" class="form-control" name="phno" placeholder="ENTER YOUR PHONE NUMBER"/>
		<input type="text" class="form-control" name="email" placeholder="ENTER YOUR EMAIL"/>
	    <input type="text" class="form-control" name="city" placeholder="ENTER YOUR CITY"/>
		<input type="hidden" value="<%=rollno %>" name="rollno"/>
		<input type="hidden" value="<%=sname %>" name="sname"/>
		<input type="hidden" value="<%=ayr %>" name="ayr"/>
		<input type="hidden" value="<%=sem %>" name="sem"/>
		<input type="hidden" value="<%=yr %>" name="yr"/>
		<input type="hidden" value="<%=dept %>" name="dept"/>
		<input type="submit" class="btn btn-outline-info" value="CONTINUE"/>
	</form>
	
</div>
</body>
</html>