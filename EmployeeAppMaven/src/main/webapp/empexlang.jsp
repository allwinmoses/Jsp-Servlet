<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<!-- Expressions -->
Welcome ${employee.employeeName }<br>
<br> City ${employee.city }
<br> EmployeeId ${employee.employeeId }
<br> Salary ${employee.salary }

<br> Course ${employee.course}

<br>
${message }<br>
${message }<br>

${sessionScope.message }<br>



	

</body>
</html>