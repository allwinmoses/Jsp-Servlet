<%@page import="com.empapp.model.Employee" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Employee employee =(Employee) request.getAttribute("employee");

	String name=employee.getEmployeeName();
	out.print("Welcome " + name+"<br>");
	
	String city = employee.getCity();
	out.print("City "+city+"<br>");
	
	Integer employeeId = employee.getEmployeeId();
	out.print("EmployeeId "+employeeId +"<br>");
	
%>

</body>
</html>