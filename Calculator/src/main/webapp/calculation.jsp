<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./calculation" method="get">
		FirstNumber: <br> <input type="text" name="firstnumber"><br>
		LastNumber: <br> <input type="text" name="secondnumber">
		<br> <select name="chooseoption" required>
			<option style="display: none"></option>
			<option value="addition">Addition</option>
			<option value="subtraction">Subtraction</option>
			<option value="multiplication">Multiplication</option>
			<option value="division">division</option>
		</select> <br> <input type="submit" value="Submit">
	</form>
</body>
</html>