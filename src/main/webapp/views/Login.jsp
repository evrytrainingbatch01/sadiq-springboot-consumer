<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h4>Welcome to Employee Login..!!</h4>
<form action="/login" method="post">
Email-Id : <input type="email" name="employeeEmailId" required="required"/><br>
Password : <input type="password" name="employeePassword" required="required"><br>
<input type="submit" name="Login" value="Login"/>
<input type="reset" name="Reset" value="Reset"/>
</form>
</body>
</html>