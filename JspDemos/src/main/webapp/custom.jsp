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

	List<String> fruits =
	Arrays.asList("apple","mango");
    sesstion.setAttribute("fruitsList",fruits);
%>
<h2>Using c:forEach</h2>
<c:forEach items="${fruitsList }"var="fruit" step="2">
${fruit}<br>


</body>
</html>