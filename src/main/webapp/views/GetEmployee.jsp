<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GetEmployee</title>
</head>
<body>
<h3>Got the Employee details with id ${employee.employeeId }</h3>
<br>
        Employee Name: ${employee.employeeName}<br>
        Employee Address: ${employee.employeeAddress}<br>
        Employee Phone number :${employee.employeePhoneNumber}<br>
        Employee Email-Id :${employee.employeeEmailId}<br>  

<h4>If You want to update profile use this Form</h4>
<form action="/updateEmployee" method="post">
	Employee Id : <input type="number" name="employeeId" placeholder="Enter Employee Id" required/><br>
	Employee Name :<input type="text" name="employeeName" placeholder="Enter Employee Name" /><br>
	Employee Password:<input type="password" name="employeePassword" placeholder="Enter Employee password" required/><br>
	Employee Address :<input type="text" name="employeeAddress" placeholder="Enter Employee address" /><br>
	Employee PhoneNumber:<input type="number" name="employeePhoneNumber" placeholder="Enter Employee phonenumber" /><br>
	Employee E-mailId : <input type="email" name="employeeEmailId" placeholder="Enter Employee email"/><br>
	
	<input type="Submit" name="update" value="UpdateProfile"/>
	<input type="Reset" name="formreset" value="Reset"/>
</form>

</body>
</html>