<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Record</title>
</head>
<body>
<form action="./deleteservlet" method="post">
		<h3>Enter the Account details below</h3>
		AccountNumber:<input type="text" name="accno"><br>
		<input type="submit" value="delete">
	</form>

</body>
</html>