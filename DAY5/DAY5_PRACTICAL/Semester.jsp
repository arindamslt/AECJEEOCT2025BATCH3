<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SEMESTER PAGE</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div style="width:30%;margin:50px auto;">
<h2 class="text-secondary">SEMESTER FORM</h2>
	<form action="Pinfo.jsp" method="post" >
		
	    <select name="sem" class="form-control">
			<option value="">CHOOSE YOUR SEMESTER</option>
			<option value="I">I</option>
			<option value="II">II</option>
			<option value="III">III</option>
			<option value="IV">IV</option>
		</select>
		<select name="yr" class="form-control">
			<option value="">CHOOSE YOUR YEAR</option>
			<option value="I">I</option>
			<option value="II">II</option>
			<option value="III">III</option>
			<option value="IV">IV</option>
		</select>
		 <select name="dept" class="form-control">
			<option value="">CHOOSE YOUR DEPARTMENT</option>
			<option value="CSE">CSE</option>
			<option value="IT">IT</option>
			<option value="ECE">ECE</option>
			<option value="IOT">IOT</option>
		</select>
		<input type="submit" class="btn btn-outline-secondary" value="CONTINUE"/>
	</form>
	
</div>
</body>
</html>