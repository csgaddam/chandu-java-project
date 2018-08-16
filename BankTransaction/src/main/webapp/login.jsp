<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
<form action="./adminservlet" method="post">
Username:<br>
<input type="text" name="username"><br>
Password:<br>
<input type="text" name="password"><br>
<input type="submit" value="login">
</form>
</body>
</html>