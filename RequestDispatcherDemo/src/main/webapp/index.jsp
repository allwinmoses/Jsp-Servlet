<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 	<form action ="register">
 	Enter EmployeeId<input type="text" name="employeeId"><br>
 	Enter name<input type="text" name="employeeName"><br>
 	Enter city<input type="text" name="city"><br>
 	Enter salary<input type="number" name="salary"><br>
 	Enter mobile<input type="text" name="mobile"><br>
 	
 	<select name="course">
 	<option value="Java">java</option>
 	<option value="Spring">Spring</option>
 	<option value="Html">Html</option>
 	
 	</select>
 	<br>
 		Enter sports<input type="checkbox" name="hobbies" value="sports">
 		Enter music<input type="checkbox" name="hobbies" value="music">
 		Enter dance<input type="checkbox" name="hobbies" value="dance">
 		Enter travel<input type="checkbox" name="hobbies" value="travel">
 	
 	
 	<input type="submit" value="submit">
 	</form>

</body>
</html>