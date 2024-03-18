<%@page import="java.util.List"%>
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



	List<String> movies = (List<String>) request.getAttribute("movies");
out.println(movies);
 	for(String showMovies: movies){
		out.println(showMovies+"<br>");
	} 
%>

</body>
</html>