<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% Employee employee =(Employee)request.getAttribute("employee");%>
<%= "wecome" + employee.getEmployee() %><br>
<%="city "+employee.getcity() %>
<%="salary "+employee.getSalary() %>
<%="Course "+employee.getCourse() %>
<%="EmployeeId "+employee.getEmployeId() %>



	

</body>
</html>