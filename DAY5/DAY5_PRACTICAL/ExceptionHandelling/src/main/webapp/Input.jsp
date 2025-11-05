<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>INPUT PAGE</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div style="width:30%;margin:50px auto;">
	<form action="Display.jsp" method="post">
		<h2 class="text-primary">EXCEPTION HANDELLING</h2>
		<input type="text" class="form-control" name="input1" placeholder="ENTER YOUR FIRST INPUT"/>
		<input type="text" class="form-control" name="input2" placeholder="ENTER YOUR SECOND INPUT"/>
	   
		<input type="submit" class="btn btn-outline-primary" value="CALCULATE"/>
	</form>
	
</div>
</body>
</html>