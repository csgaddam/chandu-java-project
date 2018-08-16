<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
	<form action="./insertservlet" method="post">
		AccountNumber:<input type="number" name="accno" required><br>
		LastName <input type="text" name="lname" required> <br>
		FirstName <input type="text" name="fname" required> <br>
		SSN <input type="number" name="ssn" required> <br>
		Address<input type="text"name="address" required> <br>
		City <input type="text" name="city"required> <br>
		State <input type="text" name="state" required><br>
		ZipCode <input type="number" name="zipcode" required><br>
		<input type="submit" value="submit">

	</form>
	<a href="fetch.jsp">get the customer details</a>
	<a href="update.jsp">Update Customer Details</a>
	<a href="delete.jsp">Delete the customer</a>
</body>
</html>