<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AllEmployees</title>
</head>
<body>
<h3>Got All Employee's details.!!</h3>
<c:forEach items="${allEmployees}" var="employee">
<table>
		
    	<tr><td>Employee Id : ${employee.employeeId }</td></tr>
        <tr><td>Employee Name: ${employee.employeeName}</td></tr>
        <tr><td>Employee Address: ${employee.employeeAddress}</td></tr>  
        <tr><td>Employee Phone number :${employee.employeePhoneNumber}</td></tr>
        <tr><td>Employee Email-Id :${employee.employeeEmailId}</td></tr>
        
 </table>   
</c:forEach>
</body>
</html>