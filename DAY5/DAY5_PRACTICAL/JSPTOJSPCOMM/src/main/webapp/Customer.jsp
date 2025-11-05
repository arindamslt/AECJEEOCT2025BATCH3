<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CUSTOMER FORM</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div style="width:30%;margin:50px auto;">
	<form action="Show.jsp" method="post">
		<h2 class="text-primary">CUSTOMER FORM</h2>
		<input type="text" class="form-control" name="cid" placeholder="ENTER YOUR CUSTOMER ID"/>
		<input type="text" class="form-control" name="cname" placeholder="ENTER YOUR NAME"/>
	    <input type="text" class="form-control" name="cphno" placeholder="ENTER YOUR PHONE NUMBER"/>
		<input type="submit" class="btn btn-outline-primary" value="ADD"/>
	</form>
	
</div>
</body>
</html>