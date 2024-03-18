<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="errorhandler.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>User Details</h2>
<%
	String employeeName =(String)request.getAttribute("employeeName");
	String city =(String)request.getAttribute("city");
	double salary =(Double)request.getAttribute("salary");
	String course =(String)request.getAttribute("course");
	Long mobile =(Long)request.getAttribute("mobile");
	String[] hobbies =(String[])request.getAttribute("hobbies");
	
	out.println("Name: "+employeeName+"<br>");
	out.println("City: "+city+"<br>");
	out.println("salary: "+salary+"<br>");
	out.println("Selected course: "+course+"<br>");
	out.println("Mobile: "+mobile+"<br>");
	out.println("Hobbies");
	if(hobbies!= null){ 
	for(String hobby:hobbies){
		out.println("hobby: "+hobby.toUpperCase()+"<br>");
	}} 
	
%>
</body>
</html>