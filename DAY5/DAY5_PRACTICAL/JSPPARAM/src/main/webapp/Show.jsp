<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<%
 String pid=request.getParameter("pid");
String pname=request.getParameter("pname");
String company=request.getParameter("company");
double price=Double.parseDouble(request.getParameter("price"));
int pqty=Integer.parseInt(request.getParameter("pqty"));
%>
<div>
<h2 class="text-danger">PURCHASE DETAILS</h2>
<table class="table table-hover table-striped table-bordered">
<thead class="table-dark">
<tr>
<th>PID</th>
<th>PROUCT NAME</th>
<th>QUANTITY</th>
<th>PRICE</th>
<th>TOTAL PRICE</th>
<th>COMPANY NAME</th>
</tr>
</thead>
<tbody>
<tr>
<td><%=pid %></td>
<td><%=pname %></td>
<td><%=pqty %></td>
<td><%=price %></td>
<td><%=pqty*price %></td>
<td><%=company %></td>
</tr>
</tbody>

</table>
</div>
</body>
</html>