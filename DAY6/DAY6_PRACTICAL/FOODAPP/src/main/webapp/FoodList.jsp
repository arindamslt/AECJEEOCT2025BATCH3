<%@page import="java.sql.ResultSet"%>
<%@page import="master.dao.FoodDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <jsp:include page="Nav.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FOOD REPORT</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<%
FoodDao fdao=new FoodDao();
ResultSet rs=fdao.getData();
%>
<div style="width:30%;margin:50px auto;" >
<h2 class="text-dark">AVAILABLE FOODS</h2>
<table class="table table-hover table-striped table-borderd">
<thead class="table-dark">
<tr>
<th>FOOD ID</th>
<th>FOOD NAME</th>
<th>PRICE</th>
</tr>
</thead>
<tbody>
<%
while(rs.next())
{
%>
<tr>
<td><%=rs.getString(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getDouble(3) %></td>
</tr>
<%
}
%>
</tbody>
</table>
</div>
</body>
</html>