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
	out.println("SessionId "+session.getId()+"<br>");
	out.println("Maxinactive "+session.getMaxInactiveInterval()+"<br>");

	String username = (String)session.getAttribute("username");
	session.setMaxInactiveInterval(1);
	out.print("Welcome " + username);
%>

	<form action = "movieServlet2">
	select language
	<select name="language">
	<option value="English"> English</option>
	<option value="Tamil"> Tamil</option>
	<option value="Kannada"> Kannada</option>
	<option value="Hindi"> Hindi</option>
	</select>
	<input type="submit" value="show Movies">
	</form>
</body>
</html>