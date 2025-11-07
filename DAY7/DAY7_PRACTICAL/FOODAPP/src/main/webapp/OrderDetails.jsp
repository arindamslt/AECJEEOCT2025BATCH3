<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <jsp:include page="NavClient.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ORDERED FOODS</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div style="width:30%;margin:50px auto;">
<h2 class="text-warning">FOOD ORDER FORM</h2>
	<form action="OrderAddServe" method="post">
		<input type="text" class="form-control" name="fid" placeholder="ENTER THE FOOD ID"/>
		<input type="text" class="form-control" name="oqty" placeholder="ENTER THE ORDERED QUANTITY"/>
	    <input type="text" class="form-control" name="uname" placeholder="ENTER YOUR USERNAME"/>
		<input type="submit" class="btn btn-outline-warning" value="ORDER"/>
	</form>
	
</div>
</body>
</html>