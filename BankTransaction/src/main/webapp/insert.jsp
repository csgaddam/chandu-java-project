<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
	<form action="/servlet2">
		AccountNumber:<input type="number" name="accno" required>
		LastName <input type="text" name="lname" required> 
		FirstName <input type="text" name="fname" required> 
		Address<input type="text"name="address" required> 
		City <input type="text" name="city"required> 
		State <input type="text" name="state" required>
		ZipCode <input type="number" name="zipcode" required>

	</form>
</body>
</html>