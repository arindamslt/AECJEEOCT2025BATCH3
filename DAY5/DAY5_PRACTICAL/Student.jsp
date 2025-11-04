<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STUDENT PAGE</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div style="width:30%;margin:50px auto;">
	<form action="Semester.jsp" method="post">
		<h2 class="text-primary">STUDENT FORM</h2>
		<input type="text" class="form-control" name="rollno" placeholder="ENTER YOUR ROLL NO"/>
		<input type="text" class="form-control" name="sname" placeholder="ENTER YOUR NAME"/>
	    <input type="text" class="form-control" name="ayr" placeholder="ENTER YOUR ADMISSION YEAR"/>
		<input type="submit" class="btn btn-outline-primary" value="CONTINUE"/>
	</form>
	
</div>
</body>
</html>