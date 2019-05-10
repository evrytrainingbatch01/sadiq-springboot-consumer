<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<form action="./addEmployee"method="post">
	Employee Name :<input type="text" name="employeeName" placeholder="Enter Employee Name" required/><br>
	Employee Password:<input type="password" name="employeePassword" placeholder="Enter Employee password" required/><br>
	Employee Address :<input type="text" name="employeeAddress" placeholder="Enter Employee address" required/><br>
	Employee PhoneNumber:<input type="number" name="employeePhoneNumber" placeholder="Enter Employee phonenumber" required/><br>
	Employee E-mailId : <input type="email" name="employeeEmailId" placeholder="Enter Employee email" required/><br>
	
	<input type="Submit" name="register" value="Register"/>
	<input type="Reset" name="formreset" value="Reset"/>
	</form>
	<p>If you already have account try login here.. <a href="/views/Login.jsp">Login</a>
</body>
</html>