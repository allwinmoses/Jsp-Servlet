<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="errorhandler.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>
	Welcome to JSP
</h1>
<%                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
	String name ="Allwin";
%>
<%= "welcome"+name %>
<% int x = 10; int y=20; %>
<%="Sum "+(x+y) %>
<%! int counter=1; %>
You are visitor no:<%= ++counter %>
<br>
<%!String greet(){
	return "welcome back";
	
}
%>
<% int a = 10/0; %>
</body>
</html>