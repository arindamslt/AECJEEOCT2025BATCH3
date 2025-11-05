<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP DEMO</title>
</head>
<body>
<h2>JSP PAGE</h2>
<%!
public double multiply(int a,int b)
{
	return(a*b);
}
%>
<%
int x=10;
int y=40;
%>
Result:<%=x+y %>

<br/>
Results:<% out.println(x+y); %>
<br/>
<%=multiply(20,30) %>
</body>
</html>