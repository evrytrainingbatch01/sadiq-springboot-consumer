<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginSuccess</title>
</head>
<body>
<h3>You have logged in successfully.</h3>
<h4>To Get one employee details</h4>
<form action="/getEmployee">
Enter ID of the Employee : <input type="number" name="employeeId"/>
<input type="submit" value="GetEmployeeDetails"/>
</form>

<h4>To delete profile use this Form</h4>
<form action="/deleteEmployee" method="post">
Employee Id : <input type="number" name="employeeId" placeholder="Enter Employee Id" required/><br>
<input type="Submit" name="update" value="DeleteProfile"/>
</form>
<br>
<h4>To get all employees details</h4>
<form action="/getAllEmployees">
<input type="submit" value="GetAllEmployees"/>
</form>
</body>
</html>